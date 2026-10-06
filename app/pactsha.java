package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactsha extends GXProcedure
{
   public pactsha( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactsha.class ), "" );
   }

   public pactsha( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 )
   {
      pactsha.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pactsha.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactsha.this.AV8DibCli = aP1[0];
      this.aP1 = aP1;
      pactsha.this.AV9DibInt = aP2[0];
      this.aP2 = aP2;
      pactsha.this.AV12ShaUbi = aP3[0];
      this.aP3 = aP3;
      pactsha.this.AV10OGSCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Actualizando", "") );
      System.out.println( httpContext.getMessage( "->Tabla CDIBUJ...", "") );
      n1605DibLocal = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02YF2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n1605DibLocal), AV12ShaUbi, A396EmprCod, AV8DibCli, Integer.valueOf(AV9DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "->1.Tabla Shablones...", "") );
      n7035ShaUbi = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02YF3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n7035ShaUbi), AV12ShaUbi, A396EmprCod, AV8DibCli, Integer.valueOf(AV9DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShablo");
      /* End optimized UPDATE. */
      /* Using cursor P02YF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV8DibCli, Integer.valueOf(AV9DibInt)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10885OGSDibC = P02YF4_A10885OGSDibC[0] ;
         n10885OGSDibC = P02YF4_n10885OGSDibC[0] ;
         A10886OGSDibI = P02YF4_A10886OGSDibI[0] ;
         n10886OGSDibI = P02YF4_n10886OGSDibI[0] ;
         A7049OGSCod = P02YF4_A7049OGSCod[0] ;
         A7050OGSEst = P02YF4_A7050OGSEst[0] ;
         n7050OGSEst = P02YF4_n7050OGSEst[0] ;
         A7143OGSUbi = P02YF4_A7143OGSUbi[0] ;
         n7143OGSUbi = P02YF4_n7143OGSUbi[0] ;
         if ( GXutil.strcmp(A7050OGSEst, httpContext.getMessage( "N", "")) == 0 )
         {
            System.out.println( httpContext.getMessage( "->Tabla ShaGra...", "") );
            A7143OGSUbi = AV12ShaUbi ;
            n7143OGSUbi = false ;
            /* Using cursor P02YF5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod), A396EmprCod, Integer.valueOf(A7049OGSCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A7031ShaCod = P02YF5_A7031ShaCod[0] ;
               A7056ShaOGSOrd = P02YF5_A7056ShaOGSOrd[0] ;
               n7056ShaOGSOrd = P02YF5_n7056ShaOGSOrd[0] ;
               /* Using cursor P02YF6 */
               pr_default.execute(4, new Object[] {A396EmprCod, A7031ShaCod});
               A7035ShaUbi = P02YF6_A7035ShaUbi[0] ;
               n7035ShaUbi = P02YF6_n7035ShaUbi[0] ;
               System.out.println( httpContext.getMessage( "->2.Tabla Shablones...", "") );
               A7035ShaUbi = AV12ShaUbi ;
               n7035ShaUbi = false ;
               /* Using cursor P02YF7 */
               pr_default.execute(5, new Object[] {Boolean.valueOf(n7035ShaUbi), A7035ShaUbi, A396EmprCod, A7031ShaCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShablo");
               pr_default.readNext(3);
            }
            pr_default.close(3);
            pr_default.close(4);
            /* Using cursor P02YF8 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n7143OGSUbi), A7143OGSUbi, A396EmprCod, Integer.valueOf(A7049OGSCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGra");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV10OGSCod != 0 )
      {
         /* Using cursor P02YF9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV10OGSCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A7049OGSCod = P02YF9_A7049OGSCod[0] ;
            A7143OGSUbi = P02YF9_A7143OGSUbi[0] ;
            n7143OGSUbi = P02YF9_n7143OGSUbi[0] ;
            A7143OGSUbi = AV12ShaUbi ;
            n7143OGSUbi = false ;
            /* Using cursor P02YF10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A7049OGSCod), A396EmprCod, Integer.valueOf(A7049OGSCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A7031ShaCod = P02YF10_A7031ShaCod[0] ;
               A7056ShaOGSOrd = P02YF10_A7056ShaOGSOrd[0] ;
               n7056ShaOGSOrd = P02YF10_n7056ShaOGSOrd[0] ;
               /* Using cursor P02YF11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A7031ShaCod});
               A7035ShaUbi = P02YF11_A7035ShaUbi[0] ;
               n7035ShaUbi = P02YF11_n7035ShaUbi[0] ;
               A7035ShaUbi = AV12ShaUbi ;
               n7035ShaUbi = false ;
               /* Using cursor P02YF12 */
               pr_default.execute(10, new Object[] {Boolean.valueOf(n7035ShaUbi), A7035ShaUbi, A396EmprCod, A7031ShaCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShablo");
               pr_default.readNext(8);
            }
            pr_default.close(8);
            pr_default.close(9);
            /* Using cursor P02YF13 */
            pr_default.execute(11, new Object[] {Boolean.valueOf(n7143OGSUbi), A7143OGSUbi, A396EmprCod, Integer.valueOf(A7049OGSCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaGra");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactsha.this.A396EmprCod;
      this.aP1[0] = pactsha.this.AV8DibCli;
      this.aP2[0] = pactsha.this.AV9DibInt;
      this.aP3[0] = pactsha.this.AV12ShaUbi;
      this.aP4[0] = pactsha.this.AV10OGSCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactsha");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1605DibLocal = "" ;
      A7035ShaUbi = "" ;
      scmdbuf = "" ;
      P02YF4_A396EmprCod = new String[] {""} ;
      P02YF4_A10885OGSDibC = new String[] {""} ;
      P02YF4_n10885OGSDibC = new boolean[] {false} ;
      P02YF4_A10886OGSDibI = new int[1] ;
      P02YF4_n10886OGSDibI = new boolean[] {false} ;
      P02YF4_A7049OGSCod = new int[1] ;
      P02YF4_A7050OGSEst = new String[] {""} ;
      P02YF4_n7050OGSEst = new boolean[] {false} ;
      P02YF4_A7143OGSUbi = new String[] {""} ;
      P02YF4_n7143OGSUbi = new boolean[] {false} ;
      A10885OGSDibC = "" ;
      A7050OGSEst = "" ;
      A7143OGSUbi = "" ;
      P02YF5_A7031ShaCod = new String[] {""} ;
      P02YF5_A396EmprCod = new String[] {""} ;
      P02YF5_A7049OGSCod = new int[1] ;
      P02YF5_A7056ShaOGSOrd = new byte[1] ;
      P02YF5_n7056ShaOGSOrd = new boolean[] {false} ;
      A7031ShaCod = "" ;
      P02YF6_A7035ShaUbi = new String[] {""} ;
      P02YF6_n7035ShaUbi = new boolean[] {false} ;
      P02YF9_A396EmprCod = new String[] {""} ;
      P02YF9_A7049OGSCod = new int[1] ;
      P02YF9_A7143OGSUbi = new String[] {""} ;
      P02YF9_n7143OGSUbi = new boolean[] {false} ;
      P02YF10_A7031ShaCod = new String[] {""} ;
      P02YF10_A396EmprCod = new String[] {""} ;
      P02YF10_A7049OGSCod = new int[1] ;
      P02YF10_A7056ShaOGSOrd = new byte[1] ;
      P02YF10_n7056ShaOGSOrd = new boolean[] {false} ;
      P02YF11_A7035ShaUbi = new String[] {""} ;
      P02YF11_n7035ShaUbi = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactsha__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02YF4_A396EmprCod, P02YF4_A10885OGSDibC, P02YF4_n10885OGSDibC, P02YF4_A10886OGSDibI, P02YF4_n10886OGSDibI, P02YF4_A7049OGSCod, P02YF4_A7050OGSEst, P02YF4_n7050OGSEst, P02YF4_A7143OGSUbi, P02YF4_n7143OGSUbi
            }
            , new Object[] {
            P02YF5_A7031ShaCod, P02YF5_A396EmprCod, P02YF5_A7049OGSCod, P02YF5_A7056ShaOGSOrd, P02YF5_n7056ShaOGSOrd
            }
            , new Object[] {
            P02YF6_A7035ShaUbi, P02YF6_n7035ShaUbi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02YF9_A396EmprCod, P02YF9_A7049OGSCod, P02YF9_A7143OGSUbi, P02YF9_n7143OGSUbi
            }
            , new Object[] {
            P02YF10_A7031ShaCod, P02YF10_A396EmprCod, P02YF10_A7049OGSCod, P02YF10_A7056ShaOGSOrd, P02YF10_n7056ShaOGSOrd
            }
            , new Object[] {
            P02YF11_A7035ShaUbi, P02YF11_n7035ShaUbi
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

   private byte A7056ShaOGSOrd ;
   private short Gx_err ;
   private int AV9DibInt ;
   private int AV10OGSCod ;
   private int A10886OGSDibI ;
   private int A7049OGSCod ;
   private String A396EmprCod ;
   private String AV8DibCli ;
   private String AV12ShaUbi ;
   private String A1605DibLocal ;
   private String A7035ShaUbi ;
   private String scmdbuf ;
   private String A10885OGSDibC ;
   private String A7050OGSEst ;
   private String A7143OGSUbi ;
   private String A7031ShaCod ;
   private boolean n1605DibLocal ;
   private boolean n7035ShaUbi ;
   private boolean n10885OGSDibC ;
   private boolean n10886OGSDibI ;
   private boolean n7050OGSEst ;
   private boolean n7143OGSUbi ;
   private boolean n7056ShaOGSOrd ;
   private int[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YF4_A396EmprCod ;
   private String[] P02YF4_A10885OGSDibC ;
   private boolean[] P02YF4_n10885OGSDibC ;
   private int[] P02YF4_A10886OGSDibI ;
   private boolean[] P02YF4_n10886OGSDibI ;
   private int[] P02YF4_A7049OGSCod ;
   private String[] P02YF4_A7050OGSEst ;
   private boolean[] P02YF4_n7050OGSEst ;
   private String[] P02YF4_A7143OGSUbi ;
   private boolean[] P02YF4_n7143OGSUbi ;
   private String[] P02YF5_A7031ShaCod ;
   private String[] P02YF5_A396EmprCod ;
   private int[] P02YF5_A7049OGSCod ;
   private byte[] P02YF5_A7056ShaOGSOrd ;
   private boolean[] P02YF5_n7056ShaOGSOrd ;
   private String[] P02YF6_A7035ShaUbi ;
   private boolean[] P02YF6_n7035ShaUbi ;
   private String[] P02YF9_A396EmprCod ;
   private int[] P02YF9_A7049OGSCod ;
   private String[] P02YF9_A7143OGSUbi ;
   private boolean[] P02YF9_n7143OGSUbi ;
   private String[] P02YF10_A7031ShaCod ;
   private String[] P02YF10_A396EmprCod ;
   private int[] P02YF10_A7049OGSCod ;
   private byte[] P02YF10_A7056ShaOGSOrd ;
   private boolean[] P02YF10_n7056ShaOGSOrd ;
   private String[] P02YF11_A7035ShaUbi ;
   private boolean[] P02YF11_n7035ShaUbi ;
}

final  class pactsha__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02YF2", "UPDATE TXPCDIBUJ SET DibLocal=?  WHERE EmprCod = ? and DibCli = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
         ,new UpdateCursor("P02YF3", "UPDATE TXPShablo SET ShaUbi=?  WHERE EmprCod = ? and ShaDibCli = ? and ShaDibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShablo")
         ,new ForEachCursor("P02YF4", "SELECT EmprCod, OGSDibC, OGSDibI, OGSCod, OGSEst, OGSUbi FROM TXPShaGra WHERE EmprCod = ? and OGSDibC = ? and OGSDibI = ? ORDER BY EmprCod, OGSDibC, OGSDibI ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YF5", "SELECT ShaCod, EmprCod, OGSCod, ShaOGSOrd FROM TXPShaGr1 WHERE (EmprCod = ? AND OGSCod = ?) AND (EmprCod = ? and OGSCod = ?) ORDER BY EmprCod, OGSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YF6", "SELECT ShaUbi FROM TXPShablo WHERE EmprCod = ? AND ShaCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02YF7", "UPDATE TXPShablo SET ShaUbi=?  WHERE EmprCod = ? AND ShaCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShablo")
         ,new UpdateCursor("P02YF8", "UPDATE TXPShaGra SET OGSUbi=?  WHERE EmprCod = ? AND OGSCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShaGra")
         ,new ForEachCursor("P02YF9", "SELECT EmprCod, OGSCod, OGSUbi FROM TXPShaGra WHERE EmprCod = ? and OGSCod = ? ORDER BY EmprCod, OGSCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02YF10", "SELECT ShaCod, EmprCod, OGSCod, ShaOGSOrd FROM TXPShaGr1 WHERE (EmprCod = ? AND OGSCod = ?) AND (EmprCod = ? and OGSCod = ?) ORDER BY EmprCod, OGSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02YF11", "SELECT ShaUbi FROM TXPShablo WHERE EmprCod = ? AND ShaCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02YF12", "UPDATE TXPShablo SET ShaUbi=?  WHERE EmprCod = ? AND ShaCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShablo")
         ,new UpdateCursor("P02YF13", "UPDATE TXPShaGra SET OGSUbi=?  WHERE EmprCod = ? AND OGSCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPShaGra")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 15);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

