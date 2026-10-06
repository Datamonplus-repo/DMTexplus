package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciehis extends GXProcedure
{
   public pciehis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciehis.class ), "" );
   }

   public pciehis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pciehis.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pciehis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pciehis.this.AV16AlbRecCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Proceso Cierre Empesa - REALIZADO", "") );
      /* Using cursor P01U22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P01U22_A44AlbRecCod[0] ;
         A49AlbRFen = P01U22_A49AlbRFen[0] ;
         A56AlbRUni = P01U22_A56AlbRUni[0] ;
         A47AlbREst = P01U22_A47AlbREst[0] ;
         A58AlbRUniEnt = P01U22_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = P01U22_A52AlbRPieEnt[0] ;
         AV32Unidad = A56AlbRUni ;
         AV34HisEmpKu = DecimalUtil.doubleToDec(0) ;
         AV36HisEmpPu = (short)(0) ;
         AV33HisEmpKe = DecimalUtil.doubleToDec(0) ;
         AV35HisEmpPe = (short)(0) ;
         /* Using cursor P01U23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2166HisEmpLTip = P01U23_A2166HisEmpLTip[0] ;
            n2166HisEmpLTip = P01U23_n2166HisEmpLTip[0] ;
            A2164HisEmpKu = P01U23_A2164HisEmpKu[0] ;
            n2164HisEmpKu = P01U23_n2164HisEmpKu[0] ;
            A2172HisEmpPu = P01U23_A2172HisEmpPu[0] ;
            n2172HisEmpPu = P01U23_n2172HisEmpPu[0] ;
            A2165HisEmpLin = P01U23_A2165HisEmpLin[0] ;
            if ( ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "D", "")) == 0 ) )
            {
               AV34HisEmpKu = AV34HisEmpKu.add(A2164HisEmpKu) ;
               AV36HisEmpPu = (short)(AV36HisEmpPu+A2172HisEmpPu) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P01U24 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2166HisEmpLTip = P01U24_A2166HisEmpLTip[0] ;
            n2166HisEmpLTip = P01U24_n2166HisEmpLTip[0] ;
            A2163HisEmpKe = P01U24_A2163HisEmpKe[0] ;
            n2163HisEmpKe = P01U24_n2163HisEmpKe[0] ;
            A2171HisEmpPe = P01U24_A2171HisEmpPe[0] ;
            n2171HisEmpPe = P01U24_n2171HisEmpPe[0] ;
            A2165HisEmpLin = P01U24_A2165HisEmpLin[0] ;
            if ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "E", "")) == 0 )
            {
               A2163HisEmpKe = AV34HisEmpKu ;
               n2163HisEmpKe = false ;
               A2171HisEmpPe = AV36HisEmpPu ;
               n2171HisEmpPe = false ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P01U25 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n2163HisEmpKe), A2163HisEmpKe, Boolean.valueOf(n2171HisEmpPe), Short.valueOf(A2171HisEmpPe), A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
               if (true) break;
            }
            /* Using cursor P01U26 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n2163HisEmpKe), A2163HisEmpKe, Boolean.valueOf(n2171HisEmpPe), Short.valueOf(A2171HisEmpPe), A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A47AlbREst = (byte)(1) ;
         A58AlbRUniEnt = AV34HisEmpKu ;
         A52AlbRPieEnt = AV36HisEmpPu ;
         /* Using cursor P01U27 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A47AlbREst), A58AlbRUniEnt, Integer.valueOf(A52AlbRPieEnt), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciehis.this.A396EmprCod;
      this.aP1[0] = pciehis.this.AV16AlbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pciehis");
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
      P01U22_A396EmprCod = new String[] {""} ;
      P01U22_A44AlbRecCod = new int[1] ;
      P01U22_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P01U22_A56AlbRUni = new String[] {""} ;
      P01U22_A47AlbREst = new byte[1] ;
      P01U22_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01U22_A52AlbRPieEnt = new int[1] ;
      A49AlbRFen = GXutil.nullDate() ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV32Unidad = "" ;
      AV34HisEmpKu = DecimalUtil.ZERO ;
      AV33HisEmpKe = DecimalUtil.ZERO ;
      P01U23_A396EmprCod = new String[] {""} ;
      P01U23_A44AlbRecCod = new int[1] ;
      P01U23_A2166HisEmpLTip = new String[] {""} ;
      P01U23_n2166HisEmpLTip = new boolean[] {false} ;
      P01U23_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01U23_n2164HisEmpKu = new boolean[] {false} ;
      P01U23_A2172HisEmpPu = new short[1] ;
      P01U23_n2172HisEmpPu = new boolean[] {false} ;
      P01U23_A2165HisEmpLin = new short[1] ;
      A2166HisEmpLTip = "" ;
      A2164HisEmpKu = DecimalUtil.ZERO ;
      P01U24_A396EmprCod = new String[] {""} ;
      P01U24_A44AlbRecCod = new int[1] ;
      P01U24_A2166HisEmpLTip = new String[] {""} ;
      P01U24_n2166HisEmpLTip = new boolean[] {false} ;
      P01U24_A2163HisEmpKe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01U24_n2163HisEmpKe = new boolean[] {false} ;
      P01U24_A2171HisEmpPe = new short[1] ;
      P01U24_n2171HisEmpPe = new boolean[] {false} ;
      P01U24_A2165HisEmpLin = new short[1] ;
      A2163HisEmpKe = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciehis__default(),
         new Object[] {
             new Object[] {
            P01U22_A396EmprCod, P01U22_A44AlbRecCod, P01U22_A49AlbRFen, P01U22_A56AlbRUni, P01U22_A47AlbREst, P01U22_A58AlbRUniEnt, P01U22_A52AlbRPieEnt
            }
            , new Object[] {
            P01U23_A396EmprCod, P01U23_A44AlbRecCod, P01U23_A2166HisEmpLTip, P01U23_n2166HisEmpLTip, P01U23_A2164HisEmpKu, P01U23_n2164HisEmpKu, P01U23_A2172HisEmpPu, P01U23_n2172HisEmpPu, P01U23_A2165HisEmpLin
            }
            , new Object[] {
            P01U24_A396EmprCod, P01U24_A44AlbRecCod, P01U24_A2166HisEmpLTip, P01U24_n2166HisEmpLTip, P01U24_A2163HisEmpKe, P01U24_n2163HisEmpKe, P01U24_A2171HisEmpPe, P01U24_n2171HisEmpPe, P01U24_A2165HisEmpLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short AV36HisEmpPu ;
   private short AV35HisEmpPe ;
   private short A2172HisEmpPu ;
   private short A2165HisEmpLin ;
   private short A2171HisEmpPe ;
   private short Gx_err ;
   private int AV16AlbRecCod ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV34HisEmpKu ;
   private java.math.BigDecimal AV33HisEmpKe ;
   private java.math.BigDecimal A2164HisEmpKu ;
   private java.math.BigDecimal A2163HisEmpKe ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String AV32Unidad ;
   private String A2166HisEmpLTip ;
   private java.util.Date A49AlbRFen ;
   private boolean n2166HisEmpLTip ;
   private boolean n2164HisEmpKu ;
   private boolean n2172HisEmpPu ;
   private boolean n2163HisEmpKe ;
   private boolean n2171HisEmpPe ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01U22_A396EmprCod ;
   private int[] P01U22_A44AlbRecCod ;
   private java.util.Date[] P01U22_A49AlbRFen ;
   private String[] P01U22_A56AlbRUni ;
   private byte[] P01U22_A47AlbREst ;
   private java.math.BigDecimal[] P01U22_A58AlbRUniEnt ;
   private int[] P01U22_A52AlbRPieEnt ;
   private String[] P01U23_A396EmprCod ;
   private int[] P01U23_A44AlbRecCod ;
   private String[] P01U23_A2166HisEmpLTip ;
   private boolean[] P01U23_n2166HisEmpLTip ;
   private java.math.BigDecimal[] P01U23_A2164HisEmpKu ;
   private boolean[] P01U23_n2164HisEmpKu ;
   private short[] P01U23_A2172HisEmpPu ;
   private boolean[] P01U23_n2172HisEmpPu ;
   private short[] P01U23_A2165HisEmpLin ;
   private String[] P01U24_A396EmprCod ;
   private int[] P01U24_A44AlbRecCod ;
   private String[] P01U24_A2166HisEmpLTip ;
   private boolean[] P01U24_n2166HisEmpLTip ;
   private java.math.BigDecimal[] P01U24_A2163HisEmpKe ;
   private boolean[] P01U24_n2163HisEmpKe ;
   private short[] P01U24_A2171HisEmpPe ;
   private boolean[] P01U24_n2171HisEmpPe ;
   private short[] P01U24_A2165HisEmpLin ;
}

final  class pciehis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01U22", "SELECT EmprCod, AlbRecCod, AlbRFen, AlbRUni, AlbREst, AlbRUniEnt, AlbRPieEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01U23", "SELECT EmprCod, AlbRecCod, HisEmpLTip, HisEmpKu, HisEmpPu, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01U24", "SELECT EmprCod, AlbRecCod, HisEmpLTip, HisEmpKe, HisEmpPe, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01U25", "UPDATE TXPHISEMP SET HisEmpKe=?, HisEmpPe=?  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P01U26", "UPDATE TXPHISEMP SET HisEmpKe=?, HisEmpPe=?  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P01U27", "UPDATE TXPALBREC SET AlbREst=?, AlbRUniEnt=?, AlbRPieEnt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
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
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

