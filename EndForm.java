heck this perform

PERFORM f_report_display TABLES t_ekko

t_ekpo

t_fieldcat

t_events

t_alv_sort

USING x_print.

FORM f_report_display TABLES p_t_header LIKE t_ekko

p_t_item LIKE t_ekpo

p_t_fieldcat LIKE t_fieldcat

USING p_x_print TYPE slis_print_alv.

DATA: l_repid TYPE sy-repid.

l_repid = sy-repid.

t_keyinfo-header01 = 'EBELN'.

t_keyinfo-item01 = 'EBELN'.

CALL FUNCTION 'REUSE_ALV_HIERSEQ_LIST_DISPLAY'

EXPORTING

i_callback_program = l_repid

i_callback_user_command = c_user_command

it_fieldcat = p_t_fieldcat[]

i_default = 'X'

i_tabname_header = 'T_EKKO'

i_tabname_item = 'T_EKPO'

is_keyinfo = t_keyinfo

is_print = p_x_print

TABLES

t_outtab_header = p_t_header[]

t_outtab_item = p_t_item[].

IF sy-subrc <> 0.

MESSAGE ID SY-MSGID TYPE SY-MSGTY NUMBER SY-MSGNO

WITH SY-MSGV1 SY-MSGV2 SY-MSGV3 SY-MSGV4.

ENDIF.
