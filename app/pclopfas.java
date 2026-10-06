package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclopfas extends GXProcedure
{
   public pclopfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclopfas.class ), "" );
   }

   public pclopfas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pclopfas.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pclopfas.this.AV11EmprCod = aP0[0];
      this.aP0 = aP0;
      pclopfas.this.AV8CliCodOr = aP1[0];
      this.aP1 = aP1;
      pclopfas.this.AV9CliCodDe = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Eliminado Tabla Destino..", "") );
      /* Optimized DELETE. */
      /* Using cursor P00V72 */
      pr_default.execute(0, new Object[] {AV11EmprCod, Integer.valueOf(AV9CliCodDe)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
      /* End optimized DELETE. */
      System.out.println( httpContext.getMessage( "Actualizando Tabla Destino..", "") );
      /* Using cursor P00V73 */
      pr_default.execute(1, new Object[] {AV11EmprCod, Integer.valueOf(AV8CliCodOr)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P00V73_A457FasCod[0] ;
         A252CliCod = P00V73_A252CliCod[0] ;
         A396EmprCod = P00V73_A396EmprCod[0] ;
         A14258FasFactura = P00V73_A14258FasFactura[0] ;
         A13587FasKgsEnt = P00V73_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = P00V73_n13587FasKgsEnt[0] ;
         A12704FasKgsMn = P00V73_A12704FasKgsMn[0] ;
         n12704FasKgsMn = P00V73_n12704FasKgsMn[0] ;
         A12577FasPreKgF = P00V73_A12577FasPreKgF[0] ;
         n12577FasPreKgF = P00V73_n12577FasPreKgF[0] ;
         A12576FasPreMt2 = P00V73_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = P00V73_n12576FasPreMt2[0] ;
         A10882FasPreU = P00V73_A10882FasPreU[0] ;
         n10882FasPreU = P00V73_n10882FasPreU[0] ;
         A5514ClifsiUl = P00V73_A5514ClifsiUl[0] ;
         n5514ClifsiUl = P00V73_n5514ClifsiUl[0] ;
         A5518ClifsdUl = P00V73_A5518ClifsdUl[0] ;
         n5518ClifsdUl = P00V73_n5518ClifsdUl[0] ;
         A4388FasPreFAn = P00V73_A4388FasPreFAn[0] ;
         n4388FasPreFAn = P00V73_n4388FasPreFAn[0] ;
         A4387FasPreMAn = P00V73_A4387FasPreMAn[0] ;
         n4387FasPreMAn = P00V73_n4387FasPreMAn[0] ;
         A4386FasPreKAn = P00V73_A4386FasPreKAn[0] ;
         n4386FasPreKAn = P00V73_n4386FasPreKAn[0] ;
         A4385FasPreFAc = P00V73_A4385FasPreFAc[0] ;
         n4385FasPreFAc = P00V73_n4385FasPreFAc[0] ;
         A3615FasFacCod = P00V73_A3615FasFacCod[0] ;
         n3615FasFacCod = P00V73_n3615FasFacCod[0] ;
         A470FasSumTin = P00V73_A470FasSumTin[0] ;
         n470FasSumTin = P00V73_n470FasSumTin[0] ;
         A466FasPreKgm = P00V73_A466FasPreKgm[0] ;
         n466FasPreKgm = P00V73_n466FasPreKgm[0] ;
         A467FasPreMtr = P00V73_A467FasPreMtr[0] ;
         n467FasPreMtr = P00V73_n467FasPreMtr[0] ;
         A14042FasActiva = P00V73_A14042FasActiva[0] ;
         A14042FasActiva = P00V73_A14042FasActiva[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         AV10FasCod = A457FasCod ;
         /*
            INSERT RECORD ON TABLE TXPPREFAS

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W457FasCod = A457FasCod ;
         A396EmprCod = AV11EmprCod ;
         A252CliCod = AV9CliCodDe ;
         A457FasCod = AV10FasCod ;
         /* Using cursor P00V74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, Boolean.valueOf(n5518ClifsdUl), Short.valueOf(A5518ClifsdUl), Boolean.valueOf(n5514ClifsiUl), Short.valueOf(A5514ClifsiUl), Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn, Boolean.valueOf(n13587FasKgsEnt), A13587FasKgsEnt, A14258FasFactura});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A457FasCod = W457FasCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclopfas.this.AV11EmprCod;
      this.aP1[0] = pclopfas.this.AV8CliCodOr;
      this.aP2[0] = pclopfas.this.AV9CliCodDe;
      Application.commitDataStores(context, remoteHandle, pr_default, "pclopfas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00V73_A457FasCod = new String[] {""} ;
      P00V73_A252CliCod = new int[1] ;
      P00V73_A396EmprCod = new String[] {""} ;
      P00V73_A14258FasFactura = new String[] {""} ;
      P00V73_A13587FasKgsEnt = new String[] {""} ;
      P00V73_n13587FasKgsEnt = new boolean[] {false} ;
      P00V73_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00V73_n12704FasKgsMn = new boolean[] {false} ;
      P00V73_A12577FasPreKgF = new String[] {""} ;
      P00V73_n12577FasPreKgF = new boolean[] {false} ;
      P00V73_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00V73_n12576FasPreMt2 = new boolean[] {false} ;
      P00V73_A10882FasPreU = new byte[1] ;
      P00V73_n10882FasPreU = new boolean[] {false} ;
      P00V73_A5514ClifsiUl = new short[1] ;
      P00V73_n5514ClifsiUl = new boolean[] {false} ;
      P00V73_A5518ClifsdUl = new short[1] ;
      P00V73_n5518ClifsdUl = new boolean[] {false} ;
      P00V73_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      P00V73_n4388FasPreFAn = new boolean[] {false} ;
      P00V73_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00V73_n4387FasPreMAn = new boolean[] {false} ;
      P00V73_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00V73_n4386FasPreKAn = new boolean[] {false} ;
      P00V73_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      P00V73_n4385FasPreFAc = new boolean[] {false} ;
      P00V73_A3615FasFacCod = new String[] {""} ;
      P00V73_n3615FasFacCod = new boolean[] {false} ;
      P00V73_A470FasSumTin = new String[] {""} ;
      P00V73_n470FasSumTin = new boolean[] {false} ;
      P00V73_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00V73_n466FasPreKgm = new boolean[] {false} ;
      P00V73_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00V73_n467FasPreMtr = new boolean[] {false} ;
      P00V73_A14042FasActiva = new String[] {""} ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      A14258FasFactura = "" ;
      A13587FasKgsEnt = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      A12577FasPreKgF = "" ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A4388FasPreFAn = GXutil.nullDate() ;
      A4387FasPreMAn = DecimalUtil.ZERO ;
      A4386FasPreKAn = DecimalUtil.ZERO ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A3615FasFacCod = "" ;
      A470FasSumTin = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A14042FasActiva = "" ;
      W396EmprCod = "" ;
      AV10FasCod = "" ;
      W457FasCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclopfas__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00V73_A457FasCod, P00V73_A252CliCod, P00V73_A396EmprCod, P00V73_A14258FasFactura, P00V73_A13587FasKgsEnt, P00V73_n13587FasKgsEnt, P00V73_A12704FasKgsMn, P00V73_n12704FasKgsMn, P00V73_A12577FasPreKgF, P00V73_n12577FasPreKgF,
            P00V73_A12576FasPreMt2, P00V73_n12576FasPreMt2, P00V73_A10882FasPreU, P00V73_n10882FasPreU, P00V73_A5514ClifsiUl, P00V73_n5514ClifsiUl, P00V73_A5518ClifsdUl, P00V73_n5518ClifsdUl, P00V73_A4388FasPreFAn, P00V73_n4388FasPreFAn,
            P00V73_A4387FasPreMAn, P00V73_n4387FasPreMAn, P00V73_A4386FasPreKAn, P00V73_n4386FasPreKAn, P00V73_A4385FasPreFAc, P00V73_n4385FasPreFAc, P00V73_A3615FasFacCod, P00V73_n3615FasFacCod, P00V73_A470FasSumTin, P00V73_n470FasSumTin,
            P00V73_A466FasPreKgm, P00V73_n466FasPreKgm, P00V73_A467FasPreMtr, P00V73_n467FasPreMtr, P00V73_A14042FasActiva
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10882FasPreU ;
   private short A5514ClifsiUl ;
   private short A5518ClifsdUl ;
   private short Gx_err ;
   private int AV8CliCodOr ;
   private int AV9CliCodDe ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS85 ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A4387FasPreMAn ;
   private java.math.BigDecimal A4386FasPreKAn ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String AV11EmprCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String A14258FasFactura ;
   private String A13587FasKgsEnt ;
   private String A12577FasPreKgF ;
   private String A3615FasFacCod ;
   private String A470FasSumTin ;
   private String A14042FasActiva ;
   private String W396EmprCod ;
   private String AV10FasCod ;
   private String W457FasCod ;
   private String Gx_emsg ;
   private java.util.Date A4388FasPreFAn ;
   private java.util.Date A4385FasPreFAc ;
   private boolean n13587FasKgsEnt ;
   private boolean n12704FasKgsMn ;
   private boolean n12577FasPreKgF ;
   private boolean n12576FasPreMt2 ;
   private boolean n10882FasPreU ;
   private boolean n5514ClifsiUl ;
   private boolean n5518ClifsdUl ;
   private boolean n4388FasPreFAn ;
   private boolean n4387FasPreMAn ;
   private boolean n4386FasPreKAn ;
   private boolean n4385FasPreFAc ;
   private boolean n3615FasFacCod ;
   private boolean n470FasSumTin ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00V73_A457FasCod ;
   private int[] P00V73_A252CliCod ;
   private String[] P00V73_A396EmprCod ;
   private String[] P00V73_A14258FasFactura ;
   private String[] P00V73_A13587FasKgsEnt ;
   private boolean[] P00V73_n13587FasKgsEnt ;
   private java.math.BigDecimal[] P00V73_A12704FasKgsMn ;
   private boolean[] P00V73_n12704FasKgsMn ;
   private String[] P00V73_A12577FasPreKgF ;
   private boolean[] P00V73_n12577FasPreKgF ;
   private java.math.BigDecimal[] P00V73_A12576FasPreMt2 ;
   private boolean[] P00V73_n12576FasPreMt2 ;
   private byte[] P00V73_A10882FasPreU ;
   private boolean[] P00V73_n10882FasPreU ;
   private short[] P00V73_A5514ClifsiUl ;
   private boolean[] P00V73_n5514ClifsiUl ;
   private short[] P00V73_A5518ClifsdUl ;
   private boolean[] P00V73_n5518ClifsdUl ;
   private java.util.Date[] P00V73_A4388FasPreFAn ;
   private boolean[] P00V73_n4388FasPreFAn ;
   private java.math.BigDecimal[] P00V73_A4387FasPreMAn ;
   private boolean[] P00V73_n4387FasPreMAn ;
   private java.math.BigDecimal[] P00V73_A4386FasPreKAn ;
   private boolean[] P00V73_n4386FasPreKAn ;
   private java.util.Date[] P00V73_A4385FasPreFAc ;
   private boolean[] P00V73_n4385FasPreFAc ;
   private String[] P00V73_A3615FasFacCod ;
   private boolean[] P00V73_n3615FasFacCod ;
   private String[] P00V73_A470FasSumTin ;
   private boolean[] P00V73_n470FasSumTin ;
   private java.math.BigDecimal[] P00V73_A466FasPreKgm ;
   private boolean[] P00V73_n466FasPreKgm ;
   private java.math.BigDecimal[] P00V73_A467FasPreMtr ;
   private boolean[] P00V73_n467FasPreMtr ;
   private String[] P00V73_A14042FasActiva ;
}

final  class pclopfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00V72", "DELETE FROM TXPPREFAS  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
         ,new ForEachCursor("P00V73", "SELECT T1.FasCod, T1.CliCod, T1.EmprCod, T1.FasFactura, T1.FasKgsEnt, T1.FasKgsMn, T1.FasPreKgF, T1.FasPreMt2, T1.FasPreU, T1.ClifsiUl, T1.ClifsdUl, T1.FasPreFAn, T1.FasPreMAn, T1.FasPreKAn, T1.FasPreFAc, T1.FasFacCod, T1.FasSumTin, T1.FasPreKgm, T1.FasPreMtr, T2.FasActiva FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T2.FasActiva = 'S') ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00V74", "INSERT INTO TXPPREFAS(EmprCod, CliCod, FasCod, FasPreMtr, FasPreKgm, FasSumTin, FasFacCod, FasPreFAc, FasPreKAn, FasPreMAn, FasPreFAn, ClifsdUl, ClifsiUl, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFactura) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 1);
               }
               stmt.setString(19, (String)parms[33], 1);
               return;
      }
   }

}

