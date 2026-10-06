package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactgrup extends GXProcedure
{
   public pactgrup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactgrup.class ), "" );
   }

   public pactgrup( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pactgrup.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pactgrup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactgrup.this.AV18OpeCod_in = aP1[0];
      this.aP1 = aP1;
      pactgrup.this.Gx_mode = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         /* Using cursor P01DV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18OpeCod_in)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A652OpeCod = P01DV2_A652OpeCod[0] ;
            A653OpeNom = P01DV2_A653OpeNom[0] ;
            n653OpeNom = P01DV2_n653OpeNom[0] ;
            W652OpeCod = A652OpeCod ;
            AV16OpeCod = A652OpeCod ;
            AV15OpeNom = GXutil.substring( A653OpeNom, 1, 20) ;
            AV17FlagOpe = (byte)(0) ;
            /* Using cursor P01DV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(AV16OpeCod), Integer.valueOf(A652OpeCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A503GruOpeCod = P01DV3_A503GruOpeCod[0] ;
               /* Using cursor P01DV4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
               A504GruOpeDsc = P01DV4_A504GruOpeDsc[0] ;
               n504GruOpeDsc = P01DV4_n504GruOpeDsc[0] ;
               AV17FlagOpe = (byte)(1) ;
               A504GruOpeDsc = AV15OpeNom ;
               n504GruOpeDsc = false ;
               /* Using cursor P01DV5 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n504GruOpeDsc), A504GruOpeDsc, A396EmprCod, Integer.valueOf(A503GruOpeCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRUOP");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            pr_default.close(2);
            if ( (0==AV17FlagOpe) )
            {
               /*
                  INSERT RECORD ON TABLE TXPCGRUOP

               */
               A503GruOpeCod = AV16OpeCod ;
               A504GruOpeDsc = AV15OpeNom ;
               n504GruOpeDsc = false ;
               /* Using cursor P01DV6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n504GruOpeDsc), A504GruOpeDsc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRUOP");
               if ( (pr_default.getStatus(4) == 1) )
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
               /*
                  INSERT RECORD ON TABLE TXPLGRUOP

               */
               W652OpeCod = A652OpeCod ;
               A503GruOpeCod = AV16OpeCod ;
               A652OpeCod = AV16OpeCod ;
               /* Using cursor P01DV7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Integer.valueOf(A652OpeCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLGRUOP");
               if ( (pr_default.getStatus(5) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A652OpeCod = W652OpeCod ;
               /* End Insert */
            }
            A652OpeCod = W652OpeCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Using cursor P01DV8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV18OpeCod_in)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A503GruOpeCod = P01DV8_A503GruOpeCod[0] ;
            A504GruOpeDsc = P01DV8_A504GruOpeDsc[0] ;
            n504GruOpeDsc = P01DV8_n504GruOpeDsc[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01DV9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLGRUOP");
            /* End optimized DELETE. */
            /* Using cursor P01DV10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRUOP");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         /* Using cursor P01DV11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV18OpeCod_in)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A652OpeCod = P01DV11_A652OpeCod[0] ;
            A653OpeNom = P01DV11_A653OpeNom[0] ;
            n653OpeNom = P01DV11_n653OpeNom[0] ;
            AV15OpeNom = GXutil.substring( A653OpeNom, 1, 20) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
         n504GruOpeDsc = false ;
         /* Optimized UPDATE. */
         /* Using cursor P01DV12 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n504GruOpeDsc), AV15OpeNom, A396EmprCod, Integer.valueOf(AV18OpeCod_in)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRUOP");
         /* End optimized UPDATE. */
      }
      System.out.println( httpContext.getMessage( "Fin Actualizo Grupos Operarios F(Operarios)", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactgrup.this.A396EmprCod;
      this.aP1[0] = pactgrup.this.AV18OpeCod_in;
      this.aP2[0] = pactgrup.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactgrup");
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
      P01DV2_A396EmprCod = new String[] {""} ;
      P01DV2_A652OpeCod = new int[1] ;
      P01DV2_A653OpeNom = new String[] {""} ;
      P01DV2_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV15OpeNom = "" ;
      P01DV3_A396EmprCod = new String[] {""} ;
      P01DV3_A652OpeCod = new int[1] ;
      P01DV3_A503GruOpeCod = new int[1] ;
      P01DV4_A504GruOpeDsc = new String[] {""} ;
      P01DV4_n504GruOpeDsc = new boolean[] {false} ;
      A504GruOpeDsc = "" ;
      Gx_emsg = "" ;
      P01DV8_A396EmprCod = new String[] {""} ;
      P01DV8_A503GruOpeCod = new int[1] ;
      P01DV8_A504GruOpeDsc = new String[] {""} ;
      P01DV8_n504GruOpeDsc = new boolean[] {false} ;
      P01DV11_A396EmprCod = new String[] {""} ;
      P01DV11_A652OpeCod = new int[1] ;
      P01DV11_A653OpeNom = new String[] {""} ;
      P01DV11_n653OpeNom = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactgrup__default(),
         new Object[] {
             new Object[] {
            P01DV2_A396EmprCod, P01DV2_A652OpeCod, P01DV2_A653OpeNom, P01DV2_n653OpeNom
            }
            , new Object[] {
            P01DV3_A396EmprCod, P01DV3_A652OpeCod, P01DV3_A503GruOpeCod
            }
            , new Object[] {
            P01DV4_A504GruOpeDsc, P01DV4_n504GruOpeDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01DV8_A396EmprCod, P01DV8_A503GruOpeCod, P01DV8_A504GruOpeDsc, P01DV8_n504GruOpeDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01DV11_A396EmprCod, P01DV11_A652OpeCod, P01DV11_A653OpeNom, P01DV11_n653OpeNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17FlagOpe ;
   private short Gx_err ;
   private int AV18OpeCod_in ;
   private int A652OpeCod ;
   private int W652OpeCod ;
   private int AV16OpeCod ;
   private int A503GruOpeCod ;
   private int GX_INS53 ;
   private int GX_INS54 ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private String AV15OpeNom ;
   private String A504GruOpeDsc ;
   private String Gx_emsg ;
   private boolean n653OpeNom ;
   private boolean n504GruOpeDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01DV2_A396EmprCod ;
   private int[] P01DV2_A652OpeCod ;
   private String[] P01DV2_A653OpeNom ;
   private boolean[] P01DV2_n653OpeNom ;
   private String[] P01DV3_A396EmprCod ;
   private int[] P01DV3_A652OpeCod ;
   private int[] P01DV3_A503GruOpeCod ;
   private String[] P01DV4_A504GruOpeDsc ;
   private boolean[] P01DV4_n504GruOpeDsc ;
   private String[] P01DV8_A396EmprCod ;
   private int[] P01DV8_A503GruOpeCod ;
   private String[] P01DV8_A504GruOpeDsc ;
   private boolean[] P01DV8_n504GruOpeDsc ;
   private String[] P01DV11_A396EmprCod ;
   private int[] P01DV11_A652OpeCod ;
   private String[] P01DV11_A653OpeNom ;
   private boolean[] P01DV11_n653OpeNom ;
}

final  class pactgrup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01DV2", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01DV3", "SELECT EmprCod, OpeCod, GruOpeCod FROM TXPLGRUOP WHERE (EmprCod = ? AND GruOpeCod = ? AND OpeCod = ?) AND (EmprCod = ? and GruOpeCod = ? and OpeCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01DV4", "SELECT GruOpeDsc FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01DV5", "UPDATE TXPCGRUOP SET GruOpeDsc=?  WHERE EmprCod = ? AND GruOpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRUOP")
         ,new UpdateCursor("P01DV6", "INSERT INTO TXPCGRUOP(EmprCod, GruOpeCod, GruOpeDsc) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRUOP")
         ,new UpdateCursor("P01DV7", "INSERT INTO TXPLGRUOP(EmprCod, GruOpeCod, OpeCod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLGRUOP")
         ,new ForEachCursor("P01DV8", "SELECT EmprCod, GruOpeCod, GruOpeDsc FROM TXPCGRUOP WHERE EmprCod = ? and GruOpeCod = ? ORDER BY EmprCod, GruOpeCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01DV9", "DELETE FROM TXPLGRUOP  WHERE EmprCod = ? and GruOpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLGRUOP")
         ,new UpdateCursor("P01DV10", "DELETE FROM TXPCGRUOP  WHERE EmprCod = ? AND GruOpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRUOP")
         ,new ForEachCursor("P01DV11", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01DV12", "UPDATE TXPCGRUOP SET GruOpeDsc=?  WHERE EmprCod = ? and GruOpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRUOP")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 20);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

