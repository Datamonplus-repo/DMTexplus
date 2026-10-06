package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc231 extends GXProcedure
{
   public pprc231( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc231.class ), "" );
   }

   public pprc231( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pprc231.this.aP1 = new int[] {0};
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
      pprc231.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc231.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV8DatosArticulo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DATART", ""), GXv_int2) ;
      pprc231.this.GXt_int1 = GXv_int2[0] ;
      AV8DatosArticulo = GXt_int1 ;
      /* Using cursor P05V82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P05V82_A252CliCod[0] ;
         A335DisArtCod = P05V82_A335DisArtCod[0] ;
         A334DisArtAnh = P05V82_A334DisArtAnh[0] ;
         A1906DisGraAca = P05V82_A1906DisGraAca[0] ;
         A342DisArtPes = P05V82_A342DisArtPes[0] ;
         A350DisArtRdt = P05V82_A350DisArtRdt[0] ;
         A392DisUniMed = P05V82_A392DisUniMed[0] ;
         AV15CliCod = A252CliCod ;
         AV16ARtCod = A335DisArtCod ;
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17BarAncAca1 = A334DisArtAnh ;
         AV18BarGraAca = A1906DisGraAca ;
         AV19BarPes = A342DisArtPes ;
         AV20BarRdt = A350DisArtRdt ;
         AV21BarUnimed = A392DisUniMed ;
         /* Using cursor P05V83 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A384DisPieMet = P05V83_A384DisPieMet[0] ;
            A382DisPieKil = P05V83_A382DisPieKil[0] ;
            A44AlbRecCod = P05V83_A44AlbRecCod[0] ;
            A380DisPieCod = P05V83_A380DisPieCod[0] ;
            if ( GXutil.strcmp(AV21BarUnimed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( AV8DatosArticulo == 1 )
               {
                  A382DisPieKil = ((A382DisPieKil.doubleValue()==0) ? (A384DisPieMet.multiply(DecimalUtil.doubleToDec(AV12ArtGraCru)).multiply(DecimalUtil.doubleToDec((AV13ArtCruMin/ (double) (100))))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : A382DisPieKil) ;
               }
               else
               {
                  A382DisPieKil = ((A382DisPieKil.doubleValue()==0) ? (A384DisPieMet.multiply(DecimalUtil.doubleToDec(AV18BarGraAca)).multiply(DecimalUtil.doubleToDec((AV17BarAncAca1/ (double) (100))))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : A382DisPieKil) ;
               }
            }
            /* Using cursor P05V84 */
            pr_default.execute(2, new Object[] {A382DisPieKil, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV12ArtGraCru = (short)(0) ;
      AV13ArtCruMin = (short)(0) ;
      AV14ArtPmlCru = (short)(0) ;
      /* Using cursor P05V85 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ARtCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P05V85_A65ArtCod[0] ;
         A252CliCod = P05V85_A252CliCod[0] ;
         A78ArtGraCru = P05V85_A78ArtGraCru[0] ;
         n78ArtGraCru = P05V85_n78ArtGraCru[0] ;
         A68ArtCruMin = P05V85_A68ArtCruMin[0] ;
         n68ArtCruMin = P05V85_n68ArtCruMin[0] ;
         A7415ArtPmlCru = P05V85_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P05V85_n7415ArtPmlCru[0] ;
         AV12ArtGraCru = A78ArtGraCru ;
         AV13ArtCruMin = A68ArtCruMin ;
         AV14ArtPmlCru = A7415ArtPmlCru ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc231.this.A396EmprCod;
      this.aP1[0] = pprc231.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc231");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P05V82_A396EmprCod = new String[] {""} ;
      P05V82_A361DisCod = new int[1] ;
      P05V82_A252CliCod = new int[1] ;
      P05V82_A335DisArtCod = new String[] {""} ;
      P05V82_A334DisArtAnh = new short[1] ;
      P05V82_A1906DisGraAca = new short[1] ;
      P05V82_A342DisArtPes = new short[1] ;
      P05V82_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05V82_A392DisUniMed = new String[] {""} ;
      A335DisArtCod = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      AV16ARtCod = "" ;
      AV20BarRdt = DecimalUtil.ZERO ;
      AV21BarUnimed = "" ;
      P05V83_A396EmprCod = new String[] {""} ;
      P05V83_A361DisCod = new int[1] ;
      P05V83_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05V83_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05V83_A44AlbRecCod = new int[1] ;
      P05V83_A380DisPieCod = new String[] {""} ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A380DisPieCod = "" ;
      P05V85_A396EmprCod = new String[] {""} ;
      P05V85_A65ArtCod = new String[] {""} ;
      P05V85_A252CliCod = new int[1] ;
      P05V85_A78ArtGraCru = new short[1] ;
      P05V85_n78ArtGraCru = new boolean[] {false} ;
      P05V85_A68ArtCruMin = new short[1] ;
      P05V85_n68ArtCruMin = new boolean[] {false} ;
      P05V85_A7415ArtPmlCru = new short[1] ;
      P05V85_n7415ArtPmlCru = new boolean[] {false} ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc231__default(),
         new Object[] {
             new Object[] {
            P05V82_A396EmprCod, P05V82_A361DisCod, P05V82_A252CliCod, P05V82_A335DisArtCod, P05V82_A334DisArtAnh, P05V82_A1906DisGraAca, P05V82_A342DisArtPes, P05V82_A350DisArtRdt, P05V82_A392DisUniMed
            }
            , new Object[] {
            P05V83_A396EmprCod, P05V83_A361DisCod, P05V83_A384DisPieMet, P05V83_A382DisPieKil, P05V83_A44AlbRecCod, P05V83_A380DisPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05V85_A396EmprCod, P05V85_A65ArtCod, P05V85_A252CliCod, P05V85_A78ArtGraCru, P05V85_n78ArtGraCru, P05V85_A68ArtCruMin, P05V85_n68ArtCruMin, P05V85_A7415ArtPmlCru, P05V85_n7415ArtPmlCru
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8DatosArticulo ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short A334DisArtAnh ;
   private short A1906DisGraAca ;
   private short A342DisArtPes ;
   private short AV17BarAncAca1 ;
   private short AV18BarGraAca ;
   private short AV19BarPes ;
   private short AV12ArtGraCru ;
   private short AV13ArtCruMin ;
   private short AV14ArtPmlCru ;
   private short A78ArtGraCru ;
   private short A68ArtCruMin ;
   private short A7415ArtPmlCru ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV15CliCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal AV20BarRdt ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A382DisPieKil ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A392DisUniMed ;
   private String AV16ARtCod ;
   private String AV21BarUnimed ;
   private String A380DisPieCod ;
   private String A65ArtCod ;
   private boolean returnInSub ;
   private boolean n78ArtGraCru ;
   private boolean n68ArtCruMin ;
   private boolean n7415ArtPmlCru ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05V82_A396EmprCod ;
   private int[] P05V82_A361DisCod ;
   private int[] P05V82_A252CliCod ;
   private String[] P05V82_A335DisArtCod ;
   private short[] P05V82_A334DisArtAnh ;
   private short[] P05V82_A1906DisGraAca ;
   private short[] P05V82_A342DisArtPes ;
   private java.math.BigDecimal[] P05V82_A350DisArtRdt ;
   private String[] P05V82_A392DisUniMed ;
   private String[] P05V83_A396EmprCod ;
   private int[] P05V83_A361DisCod ;
   private java.math.BigDecimal[] P05V83_A384DisPieMet ;
   private java.math.BigDecimal[] P05V83_A382DisPieKil ;
   private int[] P05V83_A44AlbRecCod ;
   private String[] P05V83_A380DisPieCod ;
   private String[] P05V85_A396EmprCod ;
   private String[] P05V85_A65ArtCod ;
   private int[] P05V85_A252CliCod ;
   private short[] P05V85_A78ArtGraCru ;
   private boolean[] P05V85_n78ArtGraCru ;
   private short[] P05V85_A68ArtCruMin ;
   private boolean[] P05V85_n68ArtCruMin ;
   private short[] P05V85_A7415ArtPmlCru ;
   private boolean[] P05V85_n7415ArtPmlCru ;
}

final  class pprc231__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05V82", "SELECT EmprCod, DisCod, CliCod, DisArtCod, DisArtAnh, DisGraAca, DisArtPes, DisArtRdt, DisUniMed FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05V83", "SELECT EmprCod, DisCod, DisPieMet, DisPieKil, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05V84", "UPDATE TXPDISALD SET DisPieKil=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new ForEachCursor("P05V85", "SELECT EmprCod, ArtCod, CliCod, ArtGraCru, ArtCruMin, ArtPmlCru FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

