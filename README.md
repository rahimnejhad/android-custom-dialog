# android-custom-dialog
**android custom dialog with OnClickListener**

>usage :

```
final CustomDialogClass mCustomDialogClass = new CustomDialogClass(getActivity(), new CustomDialogClass.MyOnClickListener() {
	@Override
	public void onClick(int mId, Dialog dialog) {
		switch (mId) {
			case R.id.btn_yes:
				Toast.makeText(getContext(), "yes", Toast.LENGTH_SHORT).show();
				dialog.dismiss();
				break;

			case R.id.btn_no:
				Toast.makeText(getContext(), "no", Toast.LENGTH_SHORT).show();
				dialog.dismiss();
				break;
			case R.id.btn_man:
				Toast.makeText(getContext(), "mohammad", Toast.LENGTH_SHORT).show();
				dialog.dismiss();
				break;
			default:
				break;
		}
	}
});

mCustomDialogClass.show();
```
