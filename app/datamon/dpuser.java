package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpuser extends GXProcedure
{
   public dpuser( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpuser.class ), "" );
   }

   public dpuser( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.datamon.SdtSdtUser executeUdp( String aP0 )
   {
      dpuser.this.aP1 = new app.datamon.SdtSdtUser[] {new app.datamon.SdtSdtUser()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        app.datamon.SdtSdtUser[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             app.datamon.SdtSdtUser[] aP1 )
   {
      dpuser.this.AV6UsuCod = aP0;
      dpuser.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004F2 */
      pr_default.execute(0, new Object[] {AV6UsuCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A850UsurCod = P004F2_A850UsurCod[0] ;
         A854UsurNom = P004F2_A854UsurNom[0] ;
         n854UsurNom = P004F2_n854UsurNom[0] ;
         A10513UsuMail = P004F2_A10513UsuMail[0] ;
         AV5Image = context.getHttpContext().getImagePath( "187ce56f-cfca-4420-9fe2-03f92d338667", "", context.getHttpContext().getTheme( )) ;
         AV11Image_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "187ce56f-cfca-4420-9fe2-03f92d338667", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         Gxm1sdtuser.setgxTv_SdtSdtUser_User_image( AV5Image );
         Gxm1sdtuser.setgxTv_SdtSdtUser_User_image_gxi( AV11Image_GXI );
         Gxm1sdtuser.setgxTv_SdtSdtUser_User_name( A854UsurNom );
         Gxm1sdtuser.setgxTv_SdtSdtUser_User_profile( A10513UsuMail );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpuser.this.Gxm1sdtuser;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdtuser = new app.datamon.SdtSdtUser(remoteHandle, context);
      scmdbuf = "" ;
      P004F2_A850UsurCod = new String[] {""} ;
      P004F2_A854UsurNom = new String[] {""} ;
      P004F2_n854UsurNom = new boolean[] {false} ;
      P004F2_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A854UsurNom = "" ;
      A10513UsuMail = "" ;
      AV5Image = "" ;
      AV11Image_GXI = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datamon.dpuser__default(),
         new Object[] {
             new Object[] {
            P004F2_A850UsurCod, P004F2_A854UsurNom, P004F2_n854UsurNom, P004F2_A10513UsuMail
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV6UsuCod ;
   private String scmdbuf ;
   private String A850UsurCod ;
   private String A854UsurNom ;
   private String A10513UsuMail ;
   private boolean n854UsurNom ;
   private String AV11Image_GXI ;
   private String AV5Image ;
   private app.datamon.SdtSdtUser[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P004F2_A850UsurCod ;
   private String[] P004F2_A854UsurNom ;
   private boolean[] P004F2_n854UsurNom ;
   private String[] P004F2_A10513UsuMail ;
   private app.datamon.SdtSdtUser Gxm1sdtuser ;
}

final  class dpuser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004F2", "SELECT UsurCod, UsurNom, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 12);
               return;
      }
   }

}

