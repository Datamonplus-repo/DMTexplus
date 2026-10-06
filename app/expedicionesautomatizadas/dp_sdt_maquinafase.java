package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_sdt_maquinafase extends GXProcedure
{
   public dp_sdt_maquinafase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_sdt_maquinafase.class ), "" );
   }

   public dp_sdt_maquinafase( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.SdtSDT_MaquinaFase executeUdp( String aP0 ,
                                                                       String aP1 ,
                                                                       String aP2 )
   {
      dp_sdt_maquinafase.this.aP3 = new app.expedicionesautomatizadas.SdtSDT_MaquinaFase[] {new app.expedicionesautomatizadas.SdtSDT_MaquinaFase()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        app.expedicionesautomatizadas.SdtSDT_MaquinaFase[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             app.expedicionesautomatizadas.SdtSDT_MaquinaFase[] aP3 )
   {
      dp_sdt_maquinafase.this.A396EmprCod = aP0;
      dp_sdt_maquinafase.this.A602MaqCod = aP1;
      dp_sdt_maquinafase.this.A1142MaqFCod = aP2;
      dp_sdt_maquinafase.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00222 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A606MaqDsc = P00222_A606MaqDsc[0] ;
         n606MaqDsc = P00222_n606MaqDsc[0] ;
         A1257MaqFasUni = P00222_A1257MaqFasUni[0] ;
         n1257MaqFasUni = P00222_n1257MaqFasUni[0] ;
         A1143MaqFDsc = P00222_A1143MaqFDsc[0] ;
         A1144MaqFFind = P00222_A1144MaqFFind[0] ;
         n1144MaqFFind = P00222_n1144MaqFFind[0] ;
         A606MaqDsc = P00222_A606MaqDsc[0] ;
         n606MaqDsc = P00222_n606MaqDsc[0] ;
         A1257MaqFasUni = P00222_A1257MaqFasUni[0] ;
         n1257MaqFasUni = P00222_n1257MaqFasUni[0] ;
         A1144MaqFFind = P00222_A1144MaqFFind[0] ;
         n1144MaqFFind = P00222_n1144MaqFFind[0] ;
         Gxm1sdt_maquinafase.setgxTv_SdtSDT_MaquinaFase_Emprcod( A396EmprCod );
         Gxm1sdt_maquinafase.setgxTv_SdtSDT_MaquinaFase_Maqcod( A602MaqCod );
         Gxm1sdt_maquinafase.setgxTv_SdtSDT_MaquinaFase_Maqdsc( A606MaqDsc );
         Gxm1sdt_maquinafase.setgxTv_SdtSDT_MaquinaFase_Maqfasuni( A1257MaqFasUni );
         Gxm1sdt_maquinafase.setgxTv_SdtSDT_MaquinaFase_Maqffind( A1144MaqFFind );
         Gxm1sdt_maquinafase.setgxTv_SdtSDT_MaquinaFase_Maqfdsc( A1143MaqFDsc );
         Gxm1sdt_maquinafase.setgxTv_SdtSDT_MaquinaFase_Maqfcod( A1142MaqFCod );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = dp_sdt_maquinafase.this.Gxm1sdt_maquinafase;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdt_maquinafase = new app.expedicionesautomatizadas.SdtSDT_MaquinaFase(remoteHandle, context);
      scmdbuf = "" ;
      P00222_A457FasCod = new String[] {""} ;
      P00222_A396EmprCod = new String[] {""} ;
      P00222_A602MaqCod = new String[] {""} ;
      P00222_A1142MaqFCod = new String[] {""} ;
      P00222_A606MaqDsc = new String[] {""} ;
      P00222_n606MaqDsc = new boolean[] {false} ;
      P00222_A1257MaqFasUni = new String[] {""} ;
      P00222_n1257MaqFasUni = new boolean[] {false} ;
      P00222_A1143MaqFDsc = new String[] {""} ;
      P00222_A1144MaqFFind = new String[] {""} ;
      P00222_n1144MaqFFind = new boolean[] {false} ;
      A606MaqDsc = "" ;
      A1257MaqFasUni = "" ;
      A1143MaqFDsc = "" ;
      A1144MaqFFind = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.dp_sdt_maquinafase__default(),
         new Object[] {
             new Object[] {
            P00222_A457FasCod, P00222_A396EmprCod, P00222_A602MaqCod, P00222_A1142MaqFCod, P00222_A606MaqDsc, P00222_n606MaqDsc, P00222_A1257MaqFasUni, P00222_n1257MaqFasUni, P00222_A1143MaqFDsc, P00222_A1144MaqFFind,
            P00222_n1144MaqFFind
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1142MaqFCod ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String A1257MaqFasUni ;
   private String A1143MaqFDsc ;
   private String A1144MaqFFind ;
   private boolean n606MaqDsc ;
   private boolean n1257MaqFasUni ;
   private boolean n1144MaqFFind ;
   private app.expedicionesautomatizadas.SdtSDT_MaquinaFase[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00222_A457FasCod ;
   private String[] P00222_A396EmprCod ;
   private String[] P00222_A602MaqCod ;
   private String[] P00222_A1142MaqFCod ;
   private String[] P00222_A606MaqDsc ;
   private boolean[] P00222_n606MaqDsc ;
   private String[] P00222_A1257MaqFasUni ;
   private boolean[] P00222_n1257MaqFasUni ;
   private String[] P00222_A1143MaqFDsc ;
   private String[] P00222_A1144MaqFFind ;
   private boolean[] P00222_n1144MaqFFind ;
   private app.expedicionesautomatizadas.SdtSDT_MaquinaFase Gxm1sdt_maquinafase ;
}

final  class dp_sdt_maquinafase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00222", "SELECT T3.FasCod, T1.EmprCod, T1.MaqCod, T1.MaqFCod, T2.MaqDsc, T2.MaqFasUni, T1.MaqFDsc, COALESCE( T3.FasCod, 'xxxxxxxx') AS MaqFFind FROM ((TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.MaqFCod) WHERE T1.EmprCod = ? and T1.MaqCod = ? and T1.MaqFCod = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 28);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

