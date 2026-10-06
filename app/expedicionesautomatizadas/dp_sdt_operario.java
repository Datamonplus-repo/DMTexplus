package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_sdt_operario extends GXProcedure
{
   public dp_sdt_operario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_sdt_operario.class ), "" );
   }

   public dp_sdt_operario( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.SdtSDT_Operario executeUdp( String aP0 ,
                                                                    int aP1 )
   {
      dp_sdt_operario.this.aP2 = new app.expedicionesautomatizadas.SdtSDT_Operario[] {new app.expedicionesautomatizadas.SdtSDT_Operario()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        app.expedicionesautomatizadas.SdtSDT_Operario[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             app.expedicionesautomatizadas.SdtSDT_Operario[] aP2 )
   {
      dp_sdt_operario.this.A396EmprCod = aP0;
      dp_sdt_operario.this.A652OpeCod = aP1;
      dp_sdt_operario.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6869OpeNom2 = P001O2_A6869OpeNom2[0] ;
         n6869OpeNom2 = P001O2_n6869OpeNom2[0] ;
         A2505OpePreHor = P001O2_A2505OpePreHor[0] ;
         n2505OpePreHor = P001O2_n2505OpePreHor[0] ;
         A6232OpeTurno = P001O2_A6232OpeTurno[0] ;
         n6232OpeTurno = P001O2_n6232OpeTurno[0] ;
         A6868OpeCedula = P001O2_A6868OpeCedula[0] ;
         n6868OpeCedula = P001O2_n6868OpeCedula[0] ;
         A8422OpeSecc = P001O2_A8422OpeSecc[0] ;
         n8422OpeSecc = P001O2_n8422OpeSecc[0] ;
         A8482OpeAct = P001O2_A8482OpeAct[0] ;
         n8482OpeAct = P001O2_n8482OpeAct[0] ;
         A8640OpePass = P001O2_A8640OpePass[0] ;
         n8640OpePass = P001O2_n8640OpePass[0] ;
         A9528OpeMSol = P001O2_A9528OpeMSol[0] ;
         n9528OpeMSol = P001O2_n9528OpeMSol[0] ;
         A9529OpeMUsu = P001O2_A9529OpeMUsu[0] ;
         n9529OpeMUsu = P001O2_n9529OpeMUsu[0] ;
         A653OpeNom = P001O2_A653OpeNom[0] ;
         n653OpeNom = P001O2_n653OpeNom[0] ;
         A13748OpeCNom = GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) + " - " + GXutil.trim( A653OpeNom) ;
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Emprcod( A396EmprCod );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opecod( A652OpeCod );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Openom( A653OpeNom );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Openom2( A6869OpeNom2 );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opeprehor( A2505OpePreHor );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opeturno( A6232OpeTurno );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opecedula( A6868OpeCedula );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opesecc( A8422OpeSecc );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opeact( A8482OpeAct );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opepass( A8640OpePass );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opemsol( A9528OpeMSol );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opemusu( A9529OpeMUsu );
         Gxm1sdt_operario.setgxTv_SdtSDT_Operario_Opecnom( A13748OpeCNom );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = dp_sdt_operario.this.Gxm1sdt_operario;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdt_operario = new app.expedicionesautomatizadas.SdtSDT_Operario(remoteHandle, context);
      scmdbuf = "" ;
      P001O2_A396EmprCod = new String[] {""} ;
      P001O2_A6869OpeNom2 = new String[] {""} ;
      P001O2_n6869OpeNom2 = new boolean[] {false} ;
      P001O2_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O2_n2505OpePreHor = new boolean[] {false} ;
      P001O2_A6232OpeTurno = new byte[1] ;
      P001O2_n6232OpeTurno = new boolean[] {false} ;
      P001O2_A6868OpeCedula = new long[1] ;
      P001O2_n6868OpeCedula = new boolean[] {false} ;
      P001O2_A8422OpeSecc = new String[] {""} ;
      P001O2_n8422OpeSecc = new boolean[] {false} ;
      P001O2_A8482OpeAct = new String[] {""} ;
      P001O2_n8482OpeAct = new boolean[] {false} ;
      P001O2_A8640OpePass = new String[] {""} ;
      P001O2_n8640OpePass = new boolean[] {false} ;
      P001O2_A9528OpeMSol = new String[] {""} ;
      P001O2_n9528OpeMSol = new boolean[] {false} ;
      P001O2_A9529OpeMUsu = new String[] {""} ;
      P001O2_n9529OpeMUsu = new boolean[] {false} ;
      P001O2_A652OpeCod = new int[1] ;
      P001O2_A653OpeNom = new String[] {""} ;
      P001O2_n653OpeNom = new boolean[] {false} ;
      A6869OpeNom2 = "" ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      A8422OpeSecc = "" ;
      A8482OpeAct = "" ;
      A8640OpePass = "" ;
      A9528OpeMSol = "" ;
      A9529OpeMUsu = "" ;
      A653OpeNom = "" ;
      A13748OpeCNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.dp_sdt_operario__default(),
         new Object[] {
             new Object[] {
            P001O2_A396EmprCod, P001O2_A6869OpeNom2, P001O2_n6869OpeNom2, P001O2_A2505OpePreHor, P001O2_n2505OpePreHor, P001O2_A6232OpeTurno, P001O2_n6232OpeTurno, P001O2_A6868OpeCedula, P001O2_n6868OpeCedula, P001O2_A8422OpeSecc,
            P001O2_n8422OpeSecc, P001O2_A8482OpeAct, P001O2_n8482OpeAct, P001O2_A8640OpePass, P001O2_n8640OpePass, P001O2_A9528OpeMSol, P001O2_n9528OpeMSol, P001O2_A9529OpeMUsu, P001O2_n9529OpeMUsu, P001O2_A652OpeCod,
            P001O2_A653OpeNom, P001O2_n653OpeNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6232OpeTurno ;
   private short Gx_err ;
   private int A652OpeCod ;
   private long A6868OpeCedula ;
   private java.math.BigDecimal A2505OpePreHor ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A6869OpeNom2 ;
   private String A8422OpeSecc ;
   private String A8482OpeAct ;
   private String A8640OpePass ;
   private String A9528OpeMSol ;
   private String A9529OpeMUsu ;
   private String A653OpeNom ;
   private boolean n6869OpeNom2 ;
   private boolean n2505OpePreHor ;
   private boolean n6232OpeTurno ;
   private boolean n6868OpeCedula ;
   private boolean n8422OpeSecc ;
   private boolean n8482OpeAct ;
   private boolean n8640OpePass ;
   private boolean n9528OpeMSol ;
   private boolean n9529OpeMUsu ;
   private boolean n653OpeNom ;
   private String A13748OpeCNom ;
   private app.expedicionesautomatizadas.SdtSDT_Operario[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P001O2_A396EmprCod ;
   private String[] P001O2_A6869OpeNom2 ;
   private boolean[] P001O2_n6869OpeNom2 ;
   private java.math.BigDecimal[] P001O2_A2505OpePreHor ;
   private boolean[] P001O2_n2505OpePreHor ;
   private byte[] P001O2_A6232OpeTurno ;
   private boolean[] P001O2_n6232OpeTurno ;
   private long[] P001O2_A6868OpeCedula ;
   private boolean[] P001O2_n6868OpeCedula ;
   private String[] P001O2_A8422OpeSecc ;
   private boolean[] P001O2_n8422OpeSecc ;
   private String[] P001O2_A8482OpeAct ;
   private boolean[] P001O2_n8482OpeAct ;
   private String[] P001O2_A8640OpePass ;
   private boolean[] P001O2_n8640OpePass ;
   private String[] P001O2_A9528OpeMSol ;
   private boolean[] P001O2_n9528OpeMSol ;
   private String[] P001O2_A9529OpeMUsu ;
   private boolean[] P001O2_n9529OpeMUsu ;
   private int[] P001O2_A652OpeCod ;
   private String[] P001O2_A653OpeNom ;
   private boolean[] P001O2_n653OpeNom ;
   private app.expedicionesautomatizadas.SdtSDT_Operario Gxm1sdt_operario ;
}

final  class dp_sdt_operario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001O2", "SELECT EmprCod, OpeNom2, OpePreHor, OpeTurno, OpeCedula, OpeSecc, OpeAct, OpePass, OpeMSol, OpeMUsu, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((String[]) buf[20])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

