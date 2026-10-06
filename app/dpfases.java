package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpfases extends GXProcedure
{
   public dpfases( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpfases.class ), "" );
   }

   public dpfases( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTFases> executeUdp( String aP0 ,
                                                        String aP1 ,
                                                        String aP2 ,
                                                        java.util.Date aP3 ,
                                                        java.util.Date aP4 ,
                                                        byte aP5 )
   {
      dpfases.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTFases>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTFases>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTFases>[] aP6 )
   {
      dpfases.this.AV5Emprcod = aP0;
      dpfases.this.AV9MaqcodIni = aP1;
      dpfases.this.AV8MaqcodFin = aP2;
      dpfases.this.AV7FInicio = aP3;
      dpfases.this.AV6FFin = aP4;
      dpfases.this.AV10TipoProduccion = aP5;
      dpfases.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000M2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV9MaqcodIni, AV8MaqcodFin, AV7FInicio, AV6FFin, Byte.valueOf(AV10TipoProduccion), Byte.valueOf(AV10TipoProduccion)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk0M2 = false ;
         A461Fase = P000M2_A461Fase[0] ;
         A396EmprCod = P000M2_A396EmprCod[0] ;
         A1525HisProKgr = P000M2_A1525HisProKgr[0] ;
         A1526HisProMtr = P000M2_A1526HisProMtr[0] ;
         A656ParCod = P000M2_A656ParCod[0] ;
         n656ParCod = P000M2_n656ParCod[0] ;
         A3612HisProReo = P000M2_A3612HisProReo[0] ;
         A4441HisProDTF = P000M2_A4441HisProDTF[0] ;
         n4441HisProDTF = P000M2_n4441HisProDTF[0] ;
         A4440HisProDTI = P000M2_A4440HisProDTI[0] ;
         n4440HisProDTI = P000M2_n4440HisProDTI[0] ;
         A602MaqCod = P000M2_A602MaqCod[0] ;
         A558HisProFec = P000M2_A558HisProFec[0] ;
         A561HisProLin = P000M2_A561HisProLin[0] ;
         Gxm1sdtfases = (app.SdtSDTFases)new app.SdtSDTFases(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtfases, 0);
         Gxm1sdtfases.setgxTv_SdtSDTFases_Fase( A461Fase );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
         dpfases.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdtfases.setgxTv_SdtSDTFases_Fasdsc( GXt_char1 );
         AV15Kilos = DecimalUtil.doubleToDec(0) ;
         AV13Metros = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P000M2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P000M2_A461Fase[0], A461Fase) == 0 ) )
         {
            brk0M2 = false ;
            A1525HisProKgr = P000M2_A1525HisProKgr[0] ;
            A1526HisProMtr = P000M2_A1526HisProMtr[0] ;
            A602MaqCod = P000M2_A602MaqCod[0] ;
            A558HisProFec = P000M2_A558HisProFec[0] ;
            A561HisProLin = P000M2_A561HisProLin[0] ;
            AV15Kilos = AV15Kilos.add(A1525HisProKgr) ;
            AV13Metros = AV13Metros.add(A1526HisProMtr) ;
            brk0M2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtfases.setgxTv_SdtSDTFases_Kilosproduccion( AV15Kilos );
         Gxm1sdtfases.setgxTv_SdtSDTFases_Metrosproduccion( AV13Metros );
         if ( ! brk0M2 )
         {
            brk0M2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpfases.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTFases>(app.SdtSDTFases.class, "SDTFases", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000M2_A461Fase = new String[] {""} ;
      P000M2_A396EmprCod = new String[] {""} ;
      P000M2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000M2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000M2_A656ParCod = new short[1] ;
      P000M2_n656ParCod = new boolean[] {false} ;
      P000M2_A3612HisProReo = new byte[1] ;
      P000M2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P000M2_n4441HisProDTF = new boolean[] {false} ;
      P000M2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P000M2_n4440HisProDTI = new boolean[] {false} ;
      P000M2_A602MaqCod = new String[] {""} ;
      P000M2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000M2_A561HisProLin = new int[1] ;
      A461Fase = "" ;
      A396EmprCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtfases = new app.SdtSDTFases(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV15Kilos = DecimalUtil.ZERO ;
      AV13Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpfases__default(),
         new Object[] {
             new Object[] {
            P000M2_A461Fase, P000M2_A396EmprCod, P000M2_A1525HisProKgr, P000M2_A1526HisProMtr, P000M2_A656ParCod, P000M2_n656ParCod, P000M2_A3612HisProReo, P000M2_A4441HisProDTF, P000M2_n4441HisProDTF, P000M2_A4440HisProDTI,
            P000M2_n4440HisProDTI, P000M2_A602MaqCod, P000M2_A558HisProFec, P000M2_A561HisProLin
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
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV13Metros ;
   private String AV5Emprcod ;
   private String AV9MaqcodIni ;
   private String AV8MaqcodFin ;
   private String scmdbuf ;
   private String A461Fase ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV7FInicio ;
   private java.util.Date AV6FFin ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean brk0M2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private GXBaseCollection<app.SdtSDTFases>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P000M2_A461Fase ;
   private String[] P000M2_A396EmprCod ;
   private java.math.BigDecimal[] P000M2_A1525HisProKgr ;
   private java.math.BigDecimal[] P000M2_A1526HisProMtr ;
   private short[] P000M2_A656ParCod ;
   private boolean[] P000M2_n656ParCod ;
   private byte[] P000M2_A3612HisProReo ;
   private java.util.Date[] P000M2_A4441HisProDTF ;
   private boolean[] P000M2_n4441HisProDTF ;
   private java.util.Date[] P000M2_A4440HisProDTI ;
   private boolean[] P000M2_n4440HisProDTI ;
   private String[] P000M2_A602MaqCod ;
   private java.util.Date[] P000M2_A558HisProFec ;
   private int[] P000M2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTFases> Gxm2rootcol ;
   private app.SdtSDTFases Gxm1sdtfases ;
}

final  class dpfases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000M2", "SELECT Fase, EmprCod, HisProKgr, HisProMtr, ParCod, HisProReo, HisProDTF, HisProDTI, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (HisProDTI >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) ORDER BY EmprCod, Fase ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

