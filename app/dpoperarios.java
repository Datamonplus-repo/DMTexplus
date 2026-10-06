package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpoperarios extends GXProcedure
{
   public dpoperarios( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpoperarios.class ), "" );
   }

   public dpoperarios( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTOperarios> executeUdp( String aP0 ,
                                                            String aP1 ,
                                                            String aP2 ,
                                                            java.util.Date aP3 ,
                                                            java.util.Date aP4 ,
                                                            byte aP5 )
   {
      dpoperarios.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTOperarios>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTOperarios>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTOperarios>[] aP6 )
   {
      dpoperarios.this.AV5Emprcod = aP0;
      dpoperarios.this.AV9MaqcodIni = aP1;
      dpoperarios.this.AV8MaqcodFin = aP2;
      dpoperarios.this.AV7FInicio = aP3;
      dpoperarios.this.AV6FFin = aP4;
      dpoperarios.this.AV10TipoProduccion = aP5;
      dpoperarios.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000P2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV9MaqcodIni, AV8MaqcodFin, AV7FInicio, AV6FFin, Byte.valueOf(AV10TipoProduccion), Byte.valueOf(AV10TipoProduccion)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk0P2 = false ;
         A503GruOpeCod = P000P2_A503GruOpeCod[0] ;
         A396EmprCod = P000P2_A396EmprCod[0] ;
         A1525HisProKgr = P000P2_A1525HisProKgr[0] ;
         A1526HisProMtr = P000P2_A1526HisProMtr[0] ;
         A656ParCod = P000P2_A656ParCod[0] ;
         n656ParCod = P000P2_n656ParCod[0] ;
         A3612HisProReo = P000P2_A3612HisProReo[0] ;
         A4441HisProDTF = P000P2_A4441HisProDTF[0] ;
         n4441HisProDTF = P000P2_n4441HisProDTF[0] ;
         A4440HisProDTI = P000P2_A4440HisProDTI[0] ;
         n4440HisProDTI = P000P2_n4440HisProDTI[0] ;
         A602MaqCod = P000P2_A602MaqCod[0] ;
         A558HisProFec = P000P2_A558HisProFec[0] ;
         A561HisProLin = P000P2_A561HisProLin[0] ;
         Gxm1sdtoperarios = (app.SdtSDTOperarios)new app.SdtSDTOperarios(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtoperarios, 0);
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Opecod( A503GruOpeCod );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( AV5Emprcod, A503GruOpeCod, GXv_char2) ;
         dpoperarios.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Openom( GXt_char1 );
         AV13Kilos = DecimalUtil.doubleToDec(0) ;
         AV14Metros = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P000P2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P000P2_A503GruOpeCod[0] == A503GruOpeCod ) )
         {
            brk0P2 = false ;
            A1525HisProKgr = P000P2_A1525HisProKgr[0] ;
            A1526HisProMtr = P000P2_A1526HisProMtr[0] ;
            A602MaqCod = P000P2_A602MaqCod[0] ;
            A558HisProFec = P000P2_A558HisProFec[0] ;
            A561HisProLin = P000P2_A561HisProLin[0] ;
            AV13Kilos = AV13Kilos.add(A1525HisProKgr) ;
            AV14Metros = AV14Metros.add(A1526HisProMtr) ;
            brk0P2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Kilosproduccion( AV13Kilos );
         Gxm1sdtoperarios.setgxTv_SdtSDTOperarios_Metrosproduccion( AV14Metros );
         if ( ! brk0P2 )
         {
            brk0P2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpoperarios.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTOperarios>(app.SdtSDTOperarios.class, "SDTOperarios", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000P2_A503GruOpeCod = new int[1] ;
      P000P2_A396EmprCod = new String[] {""} ;
      P000P2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000P2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000P2_A656ParCod = new short[1] ;
      P000P2_n656ParCod = new boolean[] {false} ;
      P000P2_A3612HisProReo = new byte[1] ;
      P000P2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P000P2_n4441HisProDTF = new boolean[] {false} ;
      P000P2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P000P2_n4440HisProDTI = new boolean[] {false} ;
      P000P2_A602MaqCod = new String[] {""} ;
      P000P2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000P2_A561HisProLin = new int[1] ;
      A396EmprCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtoperarios = new app.SdtSDTOperarios(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13Kilos = DecimalUtil.ZERO ;
      AV14Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpoperarios__default(),
         new Object[] {
             new Object[] {
            P000P2_A503GruOpeCod, P000P2_A396EmprCod, P000P2_A1525HisProKgr, P000P2_A1526HisProMtr, P000P2_A656ParCod, P000P2_n656ParCod, P000P2_A3612HisProReo, P000P2_A4441HisProDTF, P000P2_n4441HisProDTF, P000P2_A4440HisProDTI,
            P000P2_n4440HisProDTI, P000P2_A602MaqCod, P000P2_A558HisProFec, P000P2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TipoProduccion ;
   private byte A3612HisProReo ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV13Kilos ;
   private java.math.BigDecimal AV14Metros ;
   private String AV5Emprcod ;
   private String AV9MaqcodIni ;
   private String AV8MaqcodFin ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV7FInicio ;
   private java.util.Date AV6FFin ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean brk0P2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private GXBaseCollection<app.SdtSDTOperarios>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P000P2_A503GruOpeCod ;
   private String[] P000P2_A396EmprCod ;
   private java.math.BigDecimal[] P000P2_A1525HisProKgr ;
   private java.math.BigDecimal[] P000P2_A1526HisProMtr ;
   private short[] P000P2_A656ParCod ;
   private boolean[] P000P2_n656ParCod ;
   private byte[] P000P2_A3612HisProReo ;
   private java.util.Date[] P000P2_A4441HisProDTF ;
   private boolean[] P000P2_n4441HisProDTF ;
   private java.util.Date[] P000P2_A4440HisProDTI ;
   private boolean[] P000P2_n4440HisProDTI ;
   private String[] P000P2_A602MaqCod ;
   private java.util.Date[] P000P2_A558HisProFec ;
   private int[] P000P2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTOperarios> Gxm2rootcol ;
   private app.SdtSDTOperarios Gxm1sdtoperarios ;
}

final  class dpoperarios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000P2", "SELECT GruOpeCod, EmprCod, HisProKgr, HisProMtr, ParCod, HisProReo, HisProDTF, HisProDTI, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (HisProDTI >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) ORDER BY EmprCod, GruOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

