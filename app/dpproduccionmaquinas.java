package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionmaquinas extends GXProcedure
{
   public dpproduccionmaquinas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionmaquinas.class ), "" );
   }

   public dpproduccionmaquinas( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTMaquinas> executeUdp( String aP0 ,
                                                           String aP1 ,
                                                           String aP2 ,
                                                           java.util.Date aP3 ,
                                                           java.util.Date aP4 )
   {
      dpproduccionmaquinas.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTMaquinas>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        GXBaseCollection<app.SdtSDTMaquinas>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             GXBaseCollection<app.SdtSDTMaquinas>[] aP5 )
   {
      dpproduccionmaquinas.this.AV5Emprcod = aP0;
      dpproduccionmaquinas.this.AV12MaqCodInicial = aP1;
      dpproduccionmaquinas.this.AV11MaqCodFinal = aP2;
      dpproduccionmaquinas.this.AV10Hisprodti = aP3;
      dpproduccionmaquinas.this.AV9HisProdtf = aP4;
      dpproduccionmaquinas.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001D2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV12MaqCodInicial, AV10Hisprodti, AV9HisProdtf, AV11MaqCodFinal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1D2 = false ;
         A602MaqCod = P001D2_A602MaqCod[0] ;
         A396EmprCod = P001D2_A396EmprCod[0] ;
         A1525HisProKgr = P001D2_A1525HisProKgr[0] ;
         A1526HisProMtr = P001D2_A1526HisProMtr[0] ;
         A656ParCod = P001D2_A656ParCod[0] ;
         n656ParCod = P001D2_n656ParCod[0] ;
         A4441HisProDTF = P001D2_A4441HisProDTF[0] ;
         n4441HisProDTF = P001D2_n4441HisProDTF[0] ;
         A606MaqDsc = P001D2_A606MaqDsc[0] ;
         n606MaqDsc = P001D2_n606MaqDsc[0] ;
         A558HisProFec = P001D2_A558HisProFec[0] ;
         A561HisProLin = P001D2_A561HisProLin[0] ;
         A606MaqDsc = P001D2_A606MaqDsc[0] ;
         n606MaqDsc = P001D2_n606MaqDsc[0] ;
         Gxm1sdtmaquinas = (app.SdtSDTMaquinas)new app.SdtSDTMaquinas(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtmaquinas, 0);
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Maqcod( A602MaqCod );
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Maqdsc( A606MaqDsc );
         AV6Kilos = DecimalUtil.doubleToDec(0) ;
         AV7Metros = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001D2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P001D2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk1D2 = false ;
            A1525HisProKgr = P001D2_A1525HisProKgr[0] ;
            A1526HisProMtr = P001D2_A1526HisProMtr[0] ;
            A558HisProFec = P001D2_A558HisProFec[0] ;
            A561HisProLin = P001D2_A561HisProLin[0] ;
            AV6Kilos = AV6Kilos.add(A1525HisProKgr) ;
            AV7Metros = AV7Metros.add(A1526HisProMtr) ;
            brk1D2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Kilosproduccion( AV6Kilos );
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Metrosproduccion( AV7Metros );
         if ( ! brk1D2 )
         {
            brk1D2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpproduccionmaquinas.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTMaquinas>(app.SdtSDTMaquinas.class, "SDTMaquinas", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001D2_A602MaqCod = new String[] {""} ;
      P001D2_A396EmprCod = new String[] {""} ;
      P001D2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D2_A656ParCod = new short[1] ;
      P001D2_n656ParCod = new boolean[] {false} ;
      P001D2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P001D2_n4441HisProDTF = new boolean[] {false} ;
      P001D2_A606MaqDsc = new String[] {""} ;
      P001D2_n606MaqDsc = new boolean[] {false} ;
      P001D2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001D2_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtmaquinas = new app.SdtSDTMaquinas(remoteHandle, context);
      AV6Kilos = DecimalUtil.ZERO ;
      AV7Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionmaquinas__default(),
         new Object[] {
             new Object[] {
            P001D2_A602MaqCod, P001D2_A396EmprCod, P001D2_A1525HisProKgr, P001D2_A1526HisProMtr, P001D2_A656ParCod, P001D2_n656ParCod, P001D2_A4441HisProDTF, P001D2_n4441HisProDTF, P001D2_A606MaqDsc, P001D2_n606MaqDsc,
            P001D2_A558HisProFec, P001D2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short Gx_err ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV6Kilos ;
   private java.math.BigDecimal AV7Metros ;
   private String AV5Emprcod ;
   private String AV12MaqCodInicial ;
   private String AV11MaqCodFinal ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private java.util.Date AV10Hisprodti ;
   private java.util.Date AV9HisProdtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk1D2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private GXBaseCollection<app.SdtSDTMaquinas>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001D2_A602MaqCod ;
   private String[] P001D2_A396EmprCod ;
   private java.math.BigDecimal[] P001D2_A1525HisProKgr ;
   private java.math.BigDecimal[] P001D2_A1526HisProMtr ;
   private short[] P001D2_A656ParCod ;
   private boolean[] P001D2_n656ParCod ;
   private java.util.Date[] P001D2_A4441HisProDTF ;
   private boolean[] P001D2_n4441HisProDTF ;
   private String[] P001D2_A606MaqDsc ;
   private boolean[] P001D2_n606MaqDsc ;
   private java.util.Date[] P001D2_A558HisProFec ;
   private int[] P001D2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTMaquinas> Gxm2rootcol ;
   private app.SdtSDTMaquinas Gxm1sdtmaquinas ;
}

final  class dpproduccionmaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001D2", "SELECT T1.MaqCod, T1.EmprCod, T1.HisProKgr, T1.HisProMtr, T1.ParCod, T1.HisProDTF, T2.MaqDsc, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.ParCod = 0) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
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
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

