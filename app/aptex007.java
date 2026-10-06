package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptex007 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptex007 pgm = new aptex007 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptex007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptex007.class ), "" );
   }

   public aptex007( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Inicio 2ª Auditoria tabla Pedidos Comerciales", "") );
      /* Using cursor P02PY2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7017Tex_KgsP = P02PY2_A7017Tex_KgsP[0] ;
         n7017Tex_KgsP = P02PY2_n7017Tex_KgsP[0] ;
         A6864Tex_Discod = P02PY2_A6864Tex_Discod[0] ;
         n6864Tex_Discod = P02PY2_n6864Tex_Discod[0] ;
         A7060Tex_st = P02PY2_A7060Tex_st[0] ;
         n7060Tex_st = P02PY2_n7060Tex_st[0] ;
         A7061Tex_Tip = P02PY2_A7061Tex_Tip[0] ;
         n7061Tex_Tip = P02PY2_n7061Tex_Tip[0] ;
         A6857Tex_Lin = P02PY2_A6857Tex_Lin[0] ;
         A6850Tex_NPed = P02PY2_A6850Tex_NPed[0] ;
         A396EmprCod = P02PY2_A396EmprCod[0] ;
         A7017Tex_KgsP = DecimalUtil.doubleToDec(0) ;
         n7017Tex_KgsP = false ;
         AV8DisNumUni = DecimalUtil.doubleToDec(0) ;
         AV12Discod = A6864Tex_Discod ;
         AV13Emprcod = A396EmprCod ;
         /* Execute user subroutine: 'DISPOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV9Dispos == 0 )
         {
            A6864Tex_Discod = 0 ;
            n6864Tex_Discod = false ;
            A7017Tex_KgsP = DecimalUtil.doubleToDec(0) ;
            n7017Tex_KgsP = false ;
            A7060Tex_st = (byte)(0) ;
            n7060Tex_st = false ;
         }
         else
         {
            A7017Tex_KgsP = AV8DisNumUni ;
            n7017Tex_KgsP = false ;
            if ( A7017Tex_KgsP.doubleValue() > 0 )
            {
               A7060Tex_st = (byte)(1) ;
               n7060Tex_st = false ;
            }
            else
            {
               A7060Tex_st = (byte)(0) ;
               n7060Tex_st = false ;
            }
         }
         A7061Tex_Tip = " " ;
         n7061Tex_Tip = false ;
         /* Using cursor P02PY3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7017Tex_KgsP), A7017Tex_KgsP, Boolean.valueOf(n6864Tex_Discod), Integer.valueOf(A6864Tex_Discod), Boolean.valueOf(n7060Tex_st), Byte.valueOf(A7060Tex_st), Boolean.valueOf(n7061Tex_Tip), A7061Tex_Tip, A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX001");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Application.commitDataStores(context, remoteHandle, pr_default, "aptex007");
      /* Using cursor P02PY4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6850Tex_NPed = P02PY4_A6850Tex_NPed[0] ;
         A396EmprCod = P02PY4_A396EmprCod[0] ;
         A6856Tex_Estado = P02PY4_A6856Tex_Estado[0] ;
         n6856Tex_Estado = P02PY4_n6856Tex_Estado[0] ;
         AV10N_ped = 0 ;
         AV11N_pedc = 0 ;
         /* Using cursor P02PY5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A7060Tex_st = P02PY5_A7060Tex_st[0] ;
            n7060Tex_st = P02PY5_n7060Tex_st[0] ;
            A6857Tex_Lin = P02PY5_A6857Tex_Lin[0] ;
            AV10N_ped = (int)(AV10N_ped+1) ;
            if ( A7060Tex_st == 1 )
            {
               AV11N_pedc = (int)(AV11N_pedc+1) ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A6856Tex_Estado = (byte)(0) ;
         n6856Tex_Estado = false ;
         if ( ( AV10N_ped == AV11N_pedc ) && ( AV10N_ped > 0 ) )
         {
            A6856Tex_Estado = (byte)(1) ;
            n6856Tex_Estado = false ;
         }
         /* Using cursor P02PY6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n6856Tex_Estado), Byte.valueOf(A6856Tex_Estado), A396EmprCod, Integer.valueOf(A6850Tex_NPed)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX000");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      System.out.println( httpContext.getMessage( "Fin 2ª Auditoria tabla Pedidos Comerciales", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      AV9Dispos = (byte)(0) ;
      /* Using cursor P02PY7 */
      pr_default.execute(5, new Object[] {AV13Emprcod, Integer.valueOf(AV12Discod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = P02PY7_A361DisCod[0] ;
         A396EmprCod = P02PY7_A396EmprCod[0] ;
         A375DisNumUni = P02PY7_A375DisNumUni[0] ;
         AV9Dispos = (byte)(1) ;
         AV8DisNumUni = A375DisNumUni ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      if ( ( AV9Dispos == 1 ) && ( AV8DisNumUni.doubleValue() <= 0 ) )
      {
         AV8DisNumUni = DecimalUtil.doubleToDec(0) ;
         /* Optimized group. */
         /* Using cursor P02PY8 */
         pr_default.execute(6, new Object[] {AV13Emprcod, Integer.valueOf(AV12Discod)});
         c192BarNumUni = P02PY8_A192BarNumUni[0] ;
         pr_default.close(6);
         AV8DisNumUni = AV8DisNumUni.add(c192BarNumUni) ;
         /* End optimized group. */
         /* Optimized UPDATE. */
         /* Using cursor P02PY9 */
         pr_default.execute(7, new Object[] {AV8DisNumUni, AV13Emprcod, Integer.valueOf(AV12Discod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* End optimized UPDATE. */
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptex007.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptex007");
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
      P02PY2_A7017Tex_KgsP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02PY2_n7017Tex_KgsP = new boolean[] {false} ;
      P02PY2_A6864Tex_Discod = new int[1] ;
      P02PY2_n6864Tex_Discod = new boolean[] {false} ;
      P02PY2_A7060Tex_st = new byte[1] ;
      P02PY2_n7060Tex_st = new boolean[] {false} ;
      P02PY2_A7061Tex_Tip = new String[] {""} ;
      P02PY2_n7061Tex_Tip = new boolean[] {false} ;
      P02PY2_A6857Tex_Lin = new short[1] ;
      P02PY2_A6850Tex_NPed = new int[1] ;
      P02PY2_A396EmprCod = new String[] {""} ;
      A7017Tex_KgsP = DecimalUtil.ZERO ;
      A7061Tex_Tip = "" ;
      A396EmprCod = "" ;
      AV8DisNumUni = DecimalUtil.ZERO ;
      AV13Emprcod = "" ;
      P02PY4_A6850Tex_NPed = new int[1] ;
      P02PY4_A396EmprCod = new String[] {""} ;
      P02PY4_A6856Tex_Estado = new byte[1] ;
      P02PY4_n6856Tex_Estado = new boolean[] {false} ;
      P02PY5_A396EmprCod = new String[] {""} ;
      P02PY5_A6850Tex_NPed = new int[1] ;
      P02PY5_A7060Tex_st = new byte[1] ;
      P02PY5_n7060Tex_st = new boolean[] {false} ;
      P02PY5_A6857Tex_Lin = new short[1] ;
      P02PY7_A361DisCod = new int[1] ;
      P02PY7_A396EmprCod = new String[] {""} ;
      P02PY7_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      c192BarNumUni = DecimalUtil.ZERO ;
      P02PY8_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.aptex007__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.aptex007__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.aptex007__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptex007__default(),
         new Object[] {
             new Object[] {
            P02PY2_A7017Tex_KgsP, P02PY2_n7017Tex_KgsP, P02PY2_A6864Tex_Discod, P02PY2_n6864Tex_Discod, P02PY2_A7060Tex_st, P02PY2_n7060Tex_st, P02PY2_A7061Tex_Tip, P02PY2_n7061Tex_Tip, P02PY2_A6857Tex_Lin, P02PY2_A6850Tex_NPed,
            P02PY2_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02PY4_A6850Tex_NPed, P02PY4_A396EmprCod, P02PY4_A6856Tex_Estado, P02PY4_n6856Tex_Estado
            }
            , new Object[] {
            P02PY5_A396EmprCod, P02PY5_A6850Tex_NPed, P02PY5_A7060Tex_st, P02PY5_n7060Tex_st, P02PY5_A6857Tex_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            P02PY7_A361DisCod, P02PY7_A396EmprCod, P02PY7_A375DisNumUni
            }
            , new Object[] {
            P02PY8_A192BarNumUni
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7060Tex_st ;
   private byte AV9Dispos ;
   private byte A6856Tex_Estado ;
   private short A6857Tex_Lin ;
   private short Gx_err ;
   private int A6864Tex_Discod ;
   private int A6850Tex_NPed ;
   private int AV12Discod ;
   private int AV10N_ped ;
   private int AV11N_pedc ;
   private int A361DisCod ;
   private java.math.BigDecimal A7017Tex_KgsP ;
   private java.math.BigDecimal AV8DisNumUni ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal c192BarNumUni ;
   private String scmdbuf ;
   private String A7061Tex_Tip ;
   private String A396EmprCod ;
   private String AV13Emprcod ;
   private boolean n7017Tex_KgsP ;
   private boolean n6864Tex_Discod ;
   private boolean n7060Tex_st ;
   private boolean n7061Tex_Tip ;
   private boolean returnInSub ;
   private boolean n6856Tex_Estado ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P02PY2_A7017Tex_KgsP ;
   private boolean[] P02PY2_n7017Tex_KgsP ;
   private int[] P02PY2_A6864Tex_Discod ;
   private boolean[] P02PY2_n6864Tex_Discod ;
   private byte[] P02PY2_A7060Tex_st ;
   private boolean[] P02PY2_n7060Tex_st ;
   private String[] P02PY2_A7061Tex_Tip ;
   private boolean[] P02PY2_n7061Tex_Tip ;
   private short[] P02PY2_A6857Tex_Lin ;
   private int[] P02PY2_A6850Tex_NPed ;
   private String[] P02PY2_A396EmprCod ;
   private int[] P02PY4_A6850Tex_NPed ;
   private String[] P02PY4_A396EmprCod ;
   private byte[] P02PY4_A6856Tex_Estado ;
   private boolean[] P02PY4_n6856Tex_Estado ;
   private String[] P02PY5_A396EmprCod ;
   private int[] P02PY5_A6850Tex_NPed ;
   private byte[] P02PY5_A7060Tex_st ;
   private boolean[] P02PY5_n7060Tex_st ;
   private short[] P02PY5_A6857Tex_Lin ;
   private int[] P02PY7_A361DisCod ;
   private String[] P02PY7_A396EmprCod ;
   private java.math.BigDecimal[] P02PY7_A375DisNumUni ;
   private java.math.BigDecimal[] P02PY8_A192BarNumUni ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class aptex007__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class aptex007__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class aptex007__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class aptex007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PY2", "SELECT Tex_KgsP, Tex_Discod, Tex_st, Tex_Tip, Tex_Lin, Tex_NPed, EmprCod FROM TXPTEX001 ORDER BY EmprCod, Tex_NPed, Tex_Lin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PY3", "UPDATE TXPTEX001 SET Tex_KgsP=?, Tex_Discod=?, Tex_st=?, Tex_Tip=?  WHERE EmprCod = ? AND Tex_NPed = ? AND Tex_Lin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX001")
         ,new ForEachCursor("P02PY4", "SELECT Tex_NPed, EmprCod, Tex_Estado FROM TXPTEX000 ORDER BY EmprCod, Tex_NPed ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02PY5", "SELECT EmprCod, Tex_NPed, Tex_st, Tex_Lin FROM TXPTEX001 WHERE EmprCod = ? and Tex_NPed = ? ORDER BY EmprCod, Tex_NPed, Tex_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PY6", "UPDATE TXPTEX000 SET Tex_Estado=?  WHERE EmprCod = ? AND Tex_NPed = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX000")
         ,new ForEachCursor("P02PY7", "SELECT DisCod, EmprCod, DisNumUni FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02PY8", "SELECT SUM(BarNumUni) FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02PY9", "UPDATE TXPDISPOS SET DisNumUni=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
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
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

