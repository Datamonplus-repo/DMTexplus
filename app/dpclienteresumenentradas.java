package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpclienteresumenentradas extends GXProcedure
{
   public dpclienteresumenentradas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpclienteresumenentradas.class ), "" );
   }

   public dpclienteresumenentradas( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTClienteResumenEntradas> executeUdp( String aP0 ,
                                                                         int aP1 ,
                                                                         int aP2 ,
                                                                         java.util.Date aP3 ,
                                                                         java.util.Date aP4 ,
                                                                         String aP5 ,
                                                                         String aP6 ,
                                                                         byte aP7 )
   {
      dpclienteresumenentradas.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTClienteResumenEntradas>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        GXBaseCollection<app.SdtSDTClienteResumenEntradas>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             GXBaseCollection<app.SdtSDTClienteResumenEntradas>[] aP8 )
   {
      dpclienteresumenentradas.this.AV5Emprcod = aP0;
      dpclienteresumenentradas.this.AV9ClienteInicial = aP1;
      dpclienteresumenentradas.this.AV8ClienteFinal = aP2;
      dpclienteresumenentradas.this.AV12FechaInicial = aP3;
      dpclienteresumenentradas.this.AV11FechaFinal = aP4;
      dpclienteresumenentradas.this.AV7ArticuloInicial = aP5;
      dpclienteresumenentradas.this.AV6ArticuloFinal = aP6;
      dpclienteresumenentradas.this.AV17Albrest = aP7;
      dpclienteresumenentradas.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00172 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV9ClienteInicial), AV7ArticuloInicial, AV6ArticuloFinal, AV12FechaInicial, AV11FechaFinal, Byte.valueOf(AV17Albrest), Byte.valueOf(AV17Albrest), Integer.valueOf(AV8ClienteFinal)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk172 = false ;
         A396EmprCod = P00172_A396EmprCod[0] ;
         A58AlbRUniEnt = P00172_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = P00172_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P00172_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P00172_A54AlbRPieUti[0] ;
         A252CliCod = P00172_A252CliCod[0] ;
         A47AlbREst = P00172_A47AlbREst[0] ;
         A49AlbRFen = P00172_A49AlbRFen[0] ;
         A45AlbRef = P00172_A45AlbRef[0] ;
         A279CliNom = P00172_A279CliNom[0] ;
         A44AlbRecCod = P00172_A44AlbRecCod[0] ;
         A279CliNom = P00172_A279CliNom[0] ;
         Gxm1sdtclienteresumenentradas = (app.SdtSDTClienteResumenEntradas)new app.SdtSDTClienteResumenEntradas(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtclienteresumenentradas, 0);
         Gxm1sdtclienteresumenentradas.setgxTv_SdtSDTClienteResumenEntradas_Clicod( A252CliCod );
         Gxm1sdtclienteresumenentradas.setgxTv_SdtSDTClienteResumenEntradas_Clinom( A279CliNom );
         Gxm3sdtclienteresumenentradas_level1 = (app.SdtSDTClienteResumenEntradas_Level1Item)new app.SdtSDTClienteResumenEntradas_Level1Item(remoteHandle, context);
         Gxm1sdtclienteresumenentradas.getgxTv_SdtSDTClienteResumenEntradas_Level1().add(Gxm3sdtclienteresumenentradas_level1, 0);
         AV15UndEnt = DecimalUtil.doubleToDec(0) ;
         AV13PzsEnt = 0 ;
         AV16UndUti = DecimalUtil.doubleToDec(0) ;
         AV14PzsUti = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00172_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00172_A252CliCod[0] == A252CliCod ) )
         {
            brk172 = false ;
            A58AlbRUniEnt = P00172_A58AlbRUniEnt[0] ;
            A52AlbRPieEnt = P00172_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = P00172_A60AlbRUniUti[0] ;
            A54AlbRPieUti = P00172_A54AlbRPieUti[0] ;
            A44AlbRecCod = P00172_A44AlbRecCod[0] ;
            AV15UndEnt = AV15UndEnt.add(A58AlbRUniEnt) ;
            AV13PzsEnt = (int)(AV13PzsEnt+A52AlbRPieEnt) ;
            AV16UndUti = AV16UndUti.add(A60AlbRUniUti) ;
            AV14PzsUti = (int)(AV14PzsUti+A54AlbRPieUti) ;
            brk172 = true ;
            pr_default.readNext(0);
         }
         Gxm3sdtclienteresumenentradas_level1.setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undent( AV15UndEnt );
         Gxm3sdtclienteresumenentradas_level1.setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsent( AV13PzsEnt );
         Gxm3sdtclienteresumenentradas_level1.setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Unduti( AV16UndUti );
         Gxm3sdtclienteresumenentradas_level1.setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsuti( AV14PzsUti );
         Gxm3sdtclienteresumenentradas_level1.setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Undstk( AV15UndEnt.subtract(AV16UndUti) );
         Gxm3sdtclienteresumenentradas_level1.setgxTv_SdtSDTClienteResumenEntradas_Level1Item_Pzsstk( (int)(AV13PzsEnt-AV14PzsUti) );
         if ( ! brk172 )
         {
            brk172 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dpclienteresumenentradas.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTClienteResumenEntradas>(app.SdtSDTClienteResumenEntradas.class, "SDTClienteResumenEntradas", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00172_A396EmprCod = new String[] {""} ;
      P00172_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00172_A52AlbRPieEnt = new int[1] ;
      P00172_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00172_A54AlbRPieUti = new int[1] ;
      P00172_A252CliCod = new int[1] ;
      P00172_A47AlbREst = new byte[1] ;
      P00172_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P00172_A45AlbRef = new String[] {""} ;
      P00172_A279CliNom = new String[] {""} ;
      P00172_A44AlbRecCod = new int[1] ;
      A396EmprCod = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A279CliNom = "" ;
      Gxm1sdtclienteresumenentradas = new app.SdtSDTClienteResumenEntradas(remoteHandle, context);
      Gxm3sdtclienteresumenentradas_level1 = new app.SdtSDTClienteResumenEntradas_Level1Item(remoteHandle, context);
      AV15UndEnt = DecimalUtil.ZERO ;
      AV16UndUti = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpclienteresumenentradas__default(),
         new Object[] {
             new Object[] {
            P00172_A396EmprCod, P00172_A58AlbRUniEnt, P00172_A52AlbRPieEnt, P00172_A60AlbRUniUti, P00172_A54AlbRPieUti, P00172_A252CliCod, P00172_A47AlbREst, P00172_A49AlbRFen, P00172_A45AlbRef, P00172_A279CliNom,
            P00172_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Albrest ;
   private byte A47AlbREst ;
   private short Gx_err ;
   private int AV9ClienteInicial ;
   private int AV8ClienteFinal ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int AV13PzsEnt ;
   private int AV14PzsUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV15UndEnt ;
   private java.math.BigDecimal AV16UndUti ;
   private String AV5Emprcod ;
   private String AV7ArticuloInicial ;
   private String AV6ArticuloFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private java.util.Date AV12FechaInicial ;
   private java.util.Date AV11FechaFinal ;
   private java.util.Date A49AlbRFen ;
   private boolean brk172 ;
   private GXBaseCollection<app.SdtSDTClienteResumenEntradas>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00172_A396EmprCod ;
   private java.math.BigDecimal[] P00172_A58AlbRUniEnt ;
   private int[] P00172_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P00172_A60AlbRUniUti ;
   private int[] P00172_A54AlbRPieUti ;
   private int[] P00172_A252CliCod ;
   private byte[] P00172_A47AlbREst ;
   private java.util.Date[] P00172_A49AlbRFen ;
   private String[] P00172_A45AlbRef ;
   private String[] P00172_A279CliNom ;
   private int[] P00172_A44AlbRecCod ;
   private GXBaseCollection<app.SdtSDTClienteResumenEntradas> Gxm2rootcol ;
   private app.SdtSDTClienteResumenEntradas Gxm1sdtclienteresumenentradas ;
   private app.SdtSDTClienteResumenEntradas_Level1Item Gxm3sdtclienteresumenentradas_level1 ;
}

final  class dpclienteresumenentradas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00172", "SELECT T1.EmprCod, T1.AlbRUniEnt, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRPieUti, T1.CliCod, T1.AlbREst, T1.AlbRFen, T1.AlbRef, T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRef >= ?) AND (T1.AlbRef <= ?) AND (T1.AlbRFen >= ?) AND (T1.AlbRFen <= ?) AND (T1.AlbREst = ? or ? = 9) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
      }
   }

}

