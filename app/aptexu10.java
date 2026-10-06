package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu10 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu10 pgm = new aptexu10 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu10.class ), "" );
   }

   public aptexu10( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Proceso de actualizacion....", "") );
      AV20Num_l = 0 ;
      /* Using cursor P035B2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6864Tex_Discod = P035B2_A6864Tex_Discod[0] ;
         n6864Tex_Discod = P035B2_n6864Tex_Discod[0] ;
         A396EmprCod = P035B2_A396EmprCod[0] ;
         A8325Tex_PHdr = P035B2_A8325Tex_PHdr[0] ;
         n8325Tex_PHdr = P035B2_n8325Tex_PHdr[0] ;
         A8326Tex_UHdr = P035B2_A8326Tex_UHdr[0] ;
         n8326Tex_UHdr = P035B2_n8326Tex_UHdr[0] ;
         A8327Tex_NumH = P035B2_A8327Tex_NumH[0] ;
         n8327Tex_NumH = P035B2_n8327Tex_NumH[0] ;
         A6857Tex_Lin = P035B2_A6857Tex_Lin[0] ;
         A6850Tex_NPed = P035B2_A6850Tex_NPed[0] ;
         AV15TEX_DISCOD = A6864Tex_Discod ;
         AV16Emprcod = A396EmprCod ;
         AV21Tex_nped = A6850Tex_NPed ;
         AV22Tex_lin = A6857Tex_Lin ;
         /* Execute user subroutine: 'DISBAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A8325Tex_PHdr = AV17TEX_PHDR ;
         n8325Tex_PHdr = false ;
         A8326Tex_UHdr = AV18TEX_UHDR ;
         n8326Tex_UHdr = false ;
         A8327Tex_NumH = AV19Num_p ;
         n8327Tex_NumH = false ;
         AV20Num_l = (int)(AV20Num_l+1) ;
         Gx_msg = httpContext.getMessage( "Procesando.... ", "") + GXutil.str( AV20Num_l, 9, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P035B3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n8325Tex_PHdr), Integer.valueOf(A8325Tex_PHdr), Boolean.valueOf(n8326Tex_UHdr), Integer.valueOf(A8326Tex_UHdr), Boolean.valueOf(n8327Tex_NumH), Short.valueOf(A8327Tex_NumH), A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX001");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Proceso de actualizacion....", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'DISBAR' Routine */
      returnInSub = false ;
      AV17TEX_PHDR = 0 ;
      AV18TEX_UHDR = 0 ;
      AV19Num_p = (short)(0) ;
      /* Using cursor P035B4 */
      pr_default.execute(2, new Object[] {AV16Emprcod, Integer.valueOf(AV15TEX_DISCOD)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1139DisBarCod = P035B4_A1139DisBarCod[0] ;
         A1140DisBarReo = P035B4_A1140DisBarReo[0] ;
         A1141DisBarPar = P035B4_A1141DisBarPar[0] ;
         A396EmprCod = P035B4_A396EmprCod[0] ;
         A1146DisDisCod = P035B4_A1146DisDisCod[0] ;
         W396EmprCod = A396EmprCod ;
         if ( AV17TEX_PHDR == 0 )
         {
            AV17TEX_PHDR = A1139DisBarCod ;
         }
         AV18TEX_UHDR = A1139DisBarCod ;
         AV19Num_p = (short)(AV19Num_p+1) ;
         /*
            INSERT RECORD ON TABLE TXPTEX00h

         */
         W396EmprCod = A396EmprCod ;
         A6850Tex_NPed = AV21Tex_nped ;
         A6857Tex_Lin = AV22Tex_lin ;
         A8329Tex_hd = A1139DisBarCod ;
         A8330Tex_hdr = A1140DisBarReo ;
         A8331Tex_Hdp = A1141DisBarPar ;
         A8332Tex_sth = (byte)(0) ;
         n8332Tex_sth = false ;
         /* Using cursor P035B5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin), Integer.valueOf(A8329Tex_hd), Byte.valueOf(A8330Tex_hdr), A8331Tex_Hdp, Boolean.valueOf(n8332Tex_sth), Byte.valueOf(A8332Tex_sth)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX00h");
         if ( (pr_default.getStatus(3) == 1) )
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
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu10.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu10");
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
      P035B2_A6864Tex_Discod = new int[1] ;
      P035B2_n6864Tex_Discod = new boolean[] {false} ;
      P035B2_A396EmprCod = new String[] {""} ;
      P035B2_A8325Tex_PHdr = new int[1] ;
      P035B2_n8325Tex_PHdr = new boolean[] {false} ;
      P035B2_A8326Tex_UHdr = new int[1] ;
      P035B2_n8326Tex_UHdr = new boolean[] {false} ;
      P035B2_A8327Tex_NumH = new short[1] ;
      P035B2_n8327Tex_NumH = new boolean[] {false} ;
      P035B2_A6857Tex_Lin = new short[1] ;
      P035B2_A6850Tex_NPed = new int[1] ;
      A396EmprCod = "" ;
      AV16Emprcod = "" ;
      Gx_msg = "" ;
      P035B4_A1139DisBarCod = new int[1] ;
      P035B4_A1140DisBarReo = new byte[1] ;
      P035B4_A1141DisBarPar = new String[] {""} ;
      P035B4_A396EmprCod = new String[] {""} ;
      P035B4_A1146DisDisCod = new int[1] ;
      A1141DisBarPar = "" ;
      W396EmprCod = "" ;
      A8331Tex_Hdp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu10__default(),
         new Object[] {
             new Object[] {
            P035B2_A6864Tex_Discod, P035B2_n6864Tex_Discod, P035B2_A396EmprCod, P035B2_A8325Tex_PHdr, P035B2_n8325Tex_PHdr, P035B2_A8326Tex_UHdr, P035B2_n8326Tex_UHdr, P035B2_A8327Tex_NumH, P035B2_n8327Tex_NumH, P035B2_A6857Tex_Lin,
            P035B2_A6850Tex_NPed
            }
            , new Object[] {
            }
            , new Object[] {
            P035B4_A1139DisBarCod, P035B4_A1140DisBarReo, P035B4_A1141DisBarPar, P035B4_A396EmprCod, P035B4_A1146DisDisCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1140DisBarReo ;
   private byte A8330Tex_hdr ;
   private byte A8332Tex_sth ;
   private short A8327Tex_NumH ;
   private short A6857Tex_Lin ;
   private short AV22Tex_lin ;
   private short AV19Num_p ;
   private short Gx_err ;
   private int AV20Num_l ;
   private int A6864Tex_Discod ;
   private int A8325Tex_PHdr ;
   private int A8326Tex_UHdr ;
   private int A6850Tex_NPed ;
   private int AV15TEX_DISCOD ;
   private int AV21Tex_nped ;
   private int AV17TEX_PHDR ;
   private int AV18TEX_UHDR ;
   private int A1139DisBarCod ;
   private int A1146DisDisCod ;
   private int GX_INS1152 ;
   private int A8329Tex_hd ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV16Emprcod ;
   private String Gx_msg ;
   private String A1141DisBarPar ;
   private String W396EmprCod ;
   private String A8331Tex_Hdp ;
   private String Gx_emsg ;
   private boolean n6864Tex_Discod ;
   private boolean n8325Tex_PHdr ;
   private boolean n8326Tex_UHdr ;
   private boolean n8327Tex_NumH ;
   private boolean returnInSub ;
   private boolean n8332Tex_sth ;
   private IDataStoreProvider pr_default ;
   private int[] P035B2_A6864Tex_Discod ;
   private boolean[] P035B2_n6864Tex_Discod ;
   private String[] P035B2_A396EmprCod ;
   private int[] P035B2_A8325Tex_PHdr ;
   private boolean[] P035B2_n8325Tex_PHdr ;
   private int[] P035B2_A8326Tex_UHdr ;
   private boolean[] P035B2_n8326Tex_UHdr ;
   private short[] P035B2_A8327Tex_NumH ;
   private boolean[] P035B2_n8327Tex_NumH ;
   private short[] P035B2_A6857Tex_Lin ;
   private int[] P035B2_A6850Tex_NPed ;
   private int[] P035B4_A1139DisBarCod ;
   private byte[] P035B4_A1140DisBarReo ;
   private String[] P035B4_A1141DisBarPar ;
   private String[] P035B4_A396EmprCod ;
   private int[] P035B4_A1146DisDisCod ;
}

final  class aptexu10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035B2", "SELECT Tex_Discod, EmprCod, Tex_PHdr, Tex_UHdr, Tex_NumH, Tex_Lin, Tex_NPed FROM TXPTEX001 WHERE (EmprCod = '001') AND (Tex_Discod > 0) ORDER BY EmprCod, Tex_NPed, Tex_Lin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P035B3", "UPDATE TXPTEX001 SET Tex_PHdr=?, Tex_UHdr=?, Tex_NumH=?  WHERE EmprCod = ? AND Tex_NPed = ? AND Tex_Lin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX001")
         ,new ForEachCursor("P035B4", "SELECT DisBarCod, DisBarReo, DisBarPar, EmprCod, DisDisCod FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ORDER BY EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P035B5", "INSERT INTO TXPTEX00h(EmprCod, Tex_NPed, Tex_Lin, Tex_hd, Tex_hdr, Tex_Hdp, Tex_sth) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX00h")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[7]).byteValue());
               }
               return;
      }
   }

}

