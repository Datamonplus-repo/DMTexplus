package app.websevices ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrarparametroopenss extends GXProcedure
{
   public registrarparametroopenss( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrarparametroopenss.class ), "" );
   }

   public registrarparametroopenss( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      registrarparametroopenss.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      registrarparametroopenss.this.AV10EmprCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11ContCod = "OPENSS" ;
      AV8ContDsc = "RUTA OPENSSL EXE" ;
      AV9ContDsc2 = "C:\\Program Files\\OpenSSL-Win64\\bin\\openssl.exe" ;
      AV14GXLvl4 = (byte)(0) ;
      /* Using cursor P093M2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV11ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P093M2_A313ContCod[0] ;
         A396EmprCod = P093M2_A396EmprCod[0] ;
         AV14GXLvl4 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV14GXLvl4 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPEMPLIN

         */
         A396EmprCod = AV10EmprCod ;
         A313ContCod = GXutil.trim( AV11ContCod) ;
         A314ContDsc = GXutil.trim( AV8ContDsc) ;
         A316ContVal = 0 ;
         A7208ContDsc2 = GXutil.trim( AV9ContDsc2) ;
         A1147ContVal2 = 0 ;
         A10270ContTp = "" ;
         /* Using cursor P093M3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A313ContCod, A314ContDsc, Integer.valueOf(A316ContVal), A7208ContDsc2, Long.valueOf(A1147ContVal2), A10270ContTp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = registrarparametroopenss.this.AV10EmprCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "websevices.registrarparametroopenss");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11ContCod = "" ;
      AV8ContDsc = "" ;
      AV9ContDsc2 = "" ;
      scmdbuf = "" ;
      P093M2_A313ContCod = new String[] {""} ;
      P093M2_A396EmprCod = new String[] {""} ;
      A313ContCod = "" ;
      A396EmprCod = "" ;
      A314ContDsc = "" ;
      A7208ContDsc2 = "" ;
      A10270ContTp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.websevices.registrarparametroopenss__default(),
         new Object[] {
             new Object[] {
            P093M2_A313ContCod, P093M2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14GXLvl4 ;
   private short Gx_err ;
   private int GX_INS41 ;
   private int A316ContVal ;
   private long A1147ContVal2 ;
   private String AV10EmprCod ;
   private String AV11ContCod ;
   private String AV8ContDsc ;
   private String AV9ContDsc2 ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A396EmprCod ;
   private String A314ContDsc ;
   private String A7208ContDsc2 ;
   private String A10270ContTp ;
   private String Gx_emsg ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P093M2_A313ContCod ;
   private String[] P093M2_A396EmprCod ;
}

final  class registrarparametroopenss__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093M2", "SELECT * FROM (SELECT ContCod, EmprCod FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P093M3", "INSERT INTO TXPEMPLIN(EmprCod, ContCod, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContCtrl, ContClaseD, ContFecUti, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContNumIni, ContAplica, ContFecFUt, ContNumlas, ContIdSerL, Contnumcer, Contmedio) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 20);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 100);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

