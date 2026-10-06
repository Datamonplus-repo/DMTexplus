package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class validarautenticacion extends GXProcedure
{
   public validarautenticacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( validarautenticacion.class ), "" );
   }

   public validarautenticacion( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 )
   {
      validarautenticacion.this.aP1 = new boolean[] {false};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        boolean[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             boolean[] aP1 )
   {
      validarautenticacion.this.AV11CadenaAutenticacion = aP0;
      validarautenticacion.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28UsurSockt = AV27WebSocket.getgxTv_SdtSocket_Clientid() ;
      AV9Autorizado = false ;
      AV10Autenticacion = (app.wwpbaseobjects.SdtSDTAutenticacion)new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV10Autenticacion.fromJSonString(AV11CadenaAutenticacion, null);
      AV8UsurCod = httpContext.decrypt64( AV10Autenticacion.getgxTv_SdtSDTAutenticacion_Cadena03(), AV10Autenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
      AV12EmprCod = httpContext.decrypt64( AV10Autenticacion.getgxTv_SdtSDTAutenticacion_Cadena04(), AV10Autenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
      AV36GXLvl9 = (byte)(0) ;
      /* Using cursor P07WD2 */
      pr_default.execute(0, new Object[] {AV12EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P07WD2_A396EmprCod[0] ;
         A14826EmpKey = P07WD2_A14826EmpKey[0] ;
         n14826EmpKey = P07WD2_n14826EmpKey[0] ;
         A14827EmpToken = P07WD2_A14827EmpToken[0] ;
         n14827EmpToken = P07WD2_n14827EmpToken[0] ;
         A14828EmpEnv = P07WD2_A14828EmpEnv[0] ;
         n14828EmpEnv = P07WD2_n14828EmpEnv[0] ;
         A14829EmpProd = P07WD2_A14829EmpProd[0] ;
         n14829EmpProd = P07WD2_n14829EmpProd[0] ;
         AV36GXLvl9 = (byte)(1) ;
         AV30EmpKey = A14826EmpKey ;
         AV32EmpToken = A14827EmpToken ;
         AV31EmpEnv = A14828EmpEnv ;
         AV33EmpProd = A14829EmpProd ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV36GXLvl9 == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P07WD3 */
      pr_default.execute(1, new Object[] {AV8UsurCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A850UsurCod = P07WD3_A850UsurCod[0] ;
         A14487UsurSockt = P07WD3_A14487UsurSockt[0] ;
         n14487UsurSockt = P07WD3_n14487UsurSockt[0] ;
         A13837UsurCmbPwd = P07WD3_A13837UsurCmbPwd[0] ;
         n13837UsurCmbPwd = P07WD3_n13837UsurCmbPwd[0] ;
         A855UsurPwd = P07WD3_A855UsurPwd[0] ;
         n855UsurPwd = P07WD3_n855UsurPwd[0] ;
         A14371UsurGuid = P07WD3_A14371UsurGuid[0] ;
         n14371UsurGuid = P07WD3_n14371UsurGuid[0] ;
         A854UsurNom = P07WD3_A854UsurNom[0] ;
         n854UsurNom = P07WD3_n854UsurNom[0] ;
         A10513UsuMail = P07WD3_A10513UsuMail[0] ;
         A14415UsurPrint = P07WD3_A14415UsurPrint[0] ;
         n14415UsurPrint = P07WD3_n14415UsurPrint[0] ;
         A14487UsurSockt = AV28UsurSockt ;
         n14487UsurSockt = false ;
         if ( P07WD3_n13837UsurCmbPwd[0] )
         {
            AV13isCambiarPwd = false ;
         }
         else
         {
            AV13isCambiarPwd = A13837UsurCmbPwd ;
         }
         AV14UsurPwd = A855UsurPwd ;
         if ( java.util.UUID.fromString("00000000-0000-0000-0000-000000000000").equals(A14371UsurGuid) || P07WD3_n14371UsurGuid[0] )
         {
            AV16UsurGuid = java.util.UUID.randomUUID( ) ;
            A14371UsurGuid = AV16UsurGuid ;
            n14371UsurGuid = false ;
         }
         else
         {
            AV16UsurGuid = A14371UsurGuid ;
         }
         AV18UserName = GXutil.trim( A854UsurNom) ;
         AV19UsuMail = GXutil.trim( A10513UsuMail) ;
         AV25UsurPrint = A14415UsurPrint ;
         /* Using cursor P07WD4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n14487UsurSockt), A14487UsurSockt, Boolean.valueOf(n14371UsurGuid), A14371UsurGuid, A850UsurCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV15Decryt_UsurPwd = httpContext.decrypt64( AV10Autenticacion.getgxTv_SdtSDTAutenticacion_Cadena01(), AV10Autenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
      if ( ( ( GXutil.strcmp(AV14UsurPwd, AV15Decryt_UsurPwd) == 0 ) ) && ! AV13isCambiarPwd )
      {
         AV9Autorizado = true ;
         AV17WWPContext.setgxTv_SdtWWPContext_Emprcod( AV12EmprCod );
         AV17WWPContext.setgxTv_SdtWWPContext_Username( AV18UserName );
         AV17WWPContext.setgxTv_SdtWWPContext_Usurcod( AV8UsurCod );
         AV17WWPContext.setgxTv_SdtWWPContext_Userguid( AV16UsurGuid );
         AV17WWPContext.setgxTv_SdtWWPContext_Usumail( AV19UsuMail );
         AV17WWPContext.setgxTv_SdtWWPContext_Userid( AV8UsurCod );
         AV17WWPContext.setgxTv_SdtWWPContext_Usurprint( AV25UsurPrint );
         AV17WWPContext.setgxTv_SdtWWPContext_Usursockt( AV28UsurSockt );
         AV17WWPContext.setgxTv_SdtWWPContext_Licensekey( AV30EmpKey );
         AV17WWPContext.setgxTv_SdtWWPContext_Token( AV32EmpToken );
         AV17WWPContext.setgxTv_SdtWWPContext_Environmentid( AV31EmpEnv );
         AV17WWPContext.setgxTv_SdtWWPContext_Product( AV33EmpProd );
         new app.wwpbaseobjects.setwwpcontext(remoteHandle, context).execute( AV17WWPContext) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = validarautenticacion.this.AV9Autorizado;
      Application.commitDataStores(context, remoteHandle, pr_default, "wwpbaseobjects.validarautenticacion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28UsurSockt = "" ;
      AV27WebSocket = new com.genexuscore.genexus.server.SdtSocket(remoteHandle, context);
      AV10Autenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV8UsurCod = "" ;
      AV12EmprCod = "" ;
      scmdbuf = "" ;
      P07WD2_A396EmprCod = new String[] {""} ;
      P07WD2_A14826EmpKey = new String[] {""} ;
      P07WD2_n14826EmpKey = new boolean[] {false} ;
      P07WD2_A14827EmpToken = new String[] {""} ;
      P07WD2_n14827EmpToken = new boolean[] {false} ;
      P07WD2_A14828EmpEnv = new String[] {""} ;
      P07WD2_n14828EmpEnv = new boolean[] {false} ;
      P07WD2_A14829EmpProd = new String[] {""} ;
      P07WD2_n14829EmpProd = new boolean[] {false} ;
      A396EmprCod = "" ;
      A14826EmpKey = "" ;
      A14827EmpToken = "" ;
      A14828EmpEnv = "" ;
      A14829EmpProd = "" ;
      AV30EmpKey = "" ;
      AV32EmpToken = "" ;
      AV31EmpEnv = "" ;
      AV33EmpProd = "" ;
      P07WD3_A850UsurCod = new String[] {""} ;
      P07WD3_A14487UsurSockt = new String[] {""} ;
      P07WD3_n14487UsurSockt = new boolean[] {false} ;
      P07WD3_A13837UsurCmbPwd = new boolean[] {false} ;
      P07WD3_n13837UsurCmbPwd = new boolean[] {false} ;
      P07WD3_A855UsurPwd = new String[] {""} ;
      P07WD3_n855UsurPwd = new boolean[] {false} ;
      P07WD3_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P07WD3_n14371UsurGuid = new boolean[] {false} ;
      P07WD3_A854UsurNom = new String[] {""} ;
      P07WD3_n854UsurNom = new boolean[] {false} ;
      P07WD3_A10513UsuMail = new String[] {""} ;
      P07WD3_A14415UsurPrint = new String[] {""} ;
      P07WD3_n14415UsurPrint = new boolean[] {false} ;
      A850UsurCod = "" ;
      A14487UsurSockt = "" ;
      A855UsurPwd = "" ;
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A854UsurNom = "" ;
      A10513UsuMail = "" ;
      A14415UsurPrint = "" ;
      AV14UsurPwd = "" ;
      AV16UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV18UserName = "" ;
      AV19UsuMail = "" ;
      AV25UsurPrint = "" ;
      AV15Decryt_UsurPwd = "" ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.validarautenticacion__default(),
         new Object[] {
             new Object[] {
            P07WD2_A396EmprCod, P07WD2_A14826EmpKey, P07WD2_n14826EmpKey, P07WD2_A14827EmpToken, P07WD2_n14827EmpToken, P07WD2_A14828EmpEnv, P07WD2_n14828EmpEnv, P07WD2_A14829EmpProd, P07WD2_n14829EmpProd
            }
            , new Object[] {
            P07WD3_A850UsurCod, P07WD3_A14487UsurSockt, P07WD3_n14487UsurSockt, P07WD3_A13837UsurCmbPwd, P07WD3_n13837UsurCmbPwd, P07WD3_A855UsurPwd, P07WD3_n855UsurPwd, P07WD3_A14371UsurGuid, P07WD3_n14371UsurGuid, P07WD3_A854UsurNom,
            P07WD3_n854UsurNom, P07WD3_A10513UsuMail, P07WD3_A14415UsurPrint, P07WD3_n14415UsurPrint
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36GXLvl9 ;
   private short Gx_err ;
   private String AV8UsurCod ;
   private String AV12EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A850UsurCod ;
   private String A855UsurPwd ;
   private String A854UsurNom ;
   private String A10513UsuMail ;
   private String AV14UsurPwd ;
   private String AV19UsuMail ;
   private String AV15Decryt_UsurPwd ;
   private boolean AV9Autorizado ;
   private boolean n14826EmpKey ;
   private boolean n14827EmpToken ;
   private boolean n14828EmpEnv ;
   private boolean n14829EmpProd ;
   private boolean returnInSub ;
   private boolean n14487UsurSockt ;
   private boolean A13837UsurCmbPwd ;
   private boolean n13837UsurCmbPwd ;
   private boolean n855UsurPwd ;
   private boolean n14371UsurGuid ;
   private boolean n854UsurNom ;
   private boolean n14415UsurPrint ;
   private boolean AV13isCambiarPwd ;
   private String AV11CadenaAutenticacion ;
   private String AV28UsurSockt ;
   private String A14826EmpKey ;
   private String A14827EmpToken ;
   private String A14828EmpEnv ;
   private String A14829EmpProd ;
   private String AV30EmpKey ;
   private String AV32EmpToken ;
   private String AV31EmpEnv ;
   private String AV33EmpProd ;
   private String A14487UsurSockt ;
   private String A14415UsurPrint ;
   private String AV18UserName ;
   private String AV25UsurPrint ;
   private java.util.UUID A14371UsurGuid ;
   private java.util.UUID AV16UsurGuid ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private com.genexuscore.genexus.server.SdtSocket AV27WebSocket ;
   private boolean[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07WD2_A396EmprCod ;
   private String[] P07WD2_A14826EmpKey ;
   private boolean[] P07WD2_n14826EmpKey ;
   private String[] P07WD2_A14827EmpToken ;
   private boolean[] P07WD2_n14827EmpToken ;
   private String[] P07WD2_A14828EmpEnv ;
   private boolean[] P07WD2_n14828EmpEnv ;
   private String[] P07WD2_A14829EmpProd ;
   private boolean[] P07WD2_n14829EmpProd ;
   private String[] P07WD3_A850UsurCod ;
   private String[] P07WD3_A14487UsurSockt ;
   private boolean[] P07WD3_n14487UsurSockt ;
   private boolean[] P07WD3_A13837UsurCmbPwd ;
   private boolean[] P07WD3_n13837UsurCmbPwd ;
   private String[] P07WD3_A855UsurPwd ;
   private boolean[] P07WD3_n855UsurPwd ;
   private java.util.UUID[] P07WD3_A14371UsurGuid ;
   private boolean[] P07WD3_n14371UsurGuid ;
   private String[] P07WD3_A854UsurNom ;
   private boolean[] P07WD3_n854UsurNom ;
   private String[] P07WD3_A10513UsuMail ;
   private String[] P07WD3_A14415UsurPrint ;
   private boolean[] P07WD3_n14415UsurPrint ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV10Autenticacion ;
}

final  class validarautenticacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07WD2", "SELECT EmprCod, EmpKey, EmpToken, EmpEnv, EmpProd FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07WD3", "SELECT UsurCod, UsurSockt, UsurCmbPwd, UsurPwd, UsurGuid, UsurNom, UsuMail, UsurPrint FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P07WD4", "UPDATE TXPUSUARI SET UsurSockt=?, UsurGuid=?  WHERE UsurCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUSUARI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((boolean[]) buf[3])[0] = rslt.getBoolean(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[7])[0] = rslt.getGUID(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 35);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 40);
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGUID(2, (java.util.UUID)parms[3]);
               }
               stmt.setString(3, (String)parms[4], 8);
               return;
      }
   }

}

