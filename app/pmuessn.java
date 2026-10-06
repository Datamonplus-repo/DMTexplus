package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmuessn extends GXProcedure
{
   public pmuessn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmuessn.class ), "" );
   }

   public pmuessn( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pmuessn.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pmuessn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmuessn.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmuessn.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmuessn.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmuessn.this.AV8BarPlf = aP4[0];
      this.aP4 = aP4;
      pmuessn.this.AV9Baracamar = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01YY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01YY2_A361DisCod[0] ;
         A3030BarPlf = P01YY2_A3030BarPlf[0] ;
         A4467BarAcaMar = P01YY2_A4467BarAcaMar[0] ;
         A5034BarEstTip = P01YY2_A5034BarEstTip[0] ;
         AV10Discod = A361DisCod ;
         A3030BarPlf = AV8BarPlf ;
         A4467BarAcaMar = AV9Baracamar ;
         if ( GXutil.strcmp(A3030BarPlf, httpContext.getMessage( "N", "")) == 0 )
         {
            A4467BarAcaMar = "*" ;
            A5034BarEstTip = httpContext.getMessage( "S", "") ;
         }
         /* Using cursor P01YY3 */
         pr_default.execute(1, new Object[] {A3030BarPlf, A4467BarAcaMar, A5034BarEstTip, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P01YY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV10Discod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P01YY4_A361DisCod[0] ;
         A2926DisPla = P01YY4_A2926DisPla[0] ;
         A4479DisAcaMar = P01YY4_A4479DisAcaMar[0] ;
         A5032DisEstTip = P01YY4_A5032DisEstTip[0] ;
         A2926DisPla = AV8BarPlf ;
         A4479DisAcaMar = AV9Baracamar ;
         if ( GXutil.strcmp(A2926DisPla, httpContext.getMessage( "N", "")) == 0 )
         {
            A4479DisAcaMar = "*" ;
            A5032DisEstTip = httpContext.getMessage( "S", "") ;
         }
         /* Using cursor P01YY5 */
         pr_default.execute(3, new Object[] {A2926DisPla, A4479DisAcaMar, A5032DisEstTip, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmuessn.this.A396EmprCod;
      this.aP1[0] = pmuessn.this.A129BarCod;
      this.aP2[0] = pmuessn.this.A132BarCodReo;
      this.aP3[0] = pmuessn.this.A130BarCodPar;
      this.aP4[0] = pmuessn.this.AV8BarPlf;
      this.aP5[0] = pmuessn.this.AV9Baracamar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmuessn");
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
      P01YY2_A396EmprCod = new String[] {""} ;
      P01YY2_A129BarCod = new int[1] ;
      P01YY2_A132BarCodReo = new byte[1] ;
      P01YY2_A130BarCodPar = new String[] {""} ;
      P01YY2_A361DisCod = new int[1] ;
      P01YY2_A3030BarPlf = new String[] {""} ;
      P01YY2_A4467BarAcaMar = new String[] {""} ;
      P01YY2_A5034BarEstTip = new String[] {""} ;
      A3030BarPlf = "" ;
      A4467BarAcaMar = "" ;
      A5034BarEstTip = "" ;
      P01YY4_A396EmprCod = new String[] {""} ;
      P01YY4_A361DisCod = new int[1] ;
      P01YY4_A2926DisPla = new String[] {""} ;
      P01YY4_A4479DisAcaMar = new String[] {""} ;
      P01YY4_A5032DisEstTip = new String[] {""} ;
      A2926DisPla = "" ;
      A4479DisAcaMar = "" ;
      A5032DisEstTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmuessn__default(),
         new Object[] {
             new Object[] {
            P01YY2_A396EmprCod, P01YY2_A129BarCod, P01YY2_A132BarCodReo, P01YY2_A130BarCodPar, P01YY2_A361DisCod, P01YY2_A3030BarPlf, P01YY2_A4467BarAcaMar, P01YY2_A5034BarEstTip
            }
            , new Object[] {
            }
            , new Object[] {
            P01YY4_A396EmprCod, P01YY4_A361DisCod, P01YY4_A2926DisPla, P01YY4_A4479DisAcaMar, P01YY4_A5032DisEstTip
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV10Discod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarPlf ;
   private String AV9Baracamar ;
   private String scmdbuf ;
   private String A3030BarPlf ;
   private String A4467BarAcaMar ;
   private String A5034BarEstTip ;
   private String A2926DisPla ;
   private String A4479DisAcaMar ;
   private String A5032DisEstTip ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YY2_A396EmprCod ;
   private int[] P01YY2_A129BarCod ;
   private byte[] P01YY2_A132BarCodReo ;
   private String[] P01YY2_A130BarCodPar ;
   private int[] P01YY2_A361DisCod ;
   private String[] P01YY2_A3030BarPlf ;
   private String[] P01YY2_A4467BarAcaMar ;
   private String[] P01YY2_A5034BarEstTip ;
   private String[] P01YY4_A396EmprCod ;
   private int[] P01YY4_A361DisCod ;
   private String[] P01YY4_A2926DisPla ;
   private String[] P01YY4_A4479DisAcaMar ;
   private String[] P01YY4_A5032DisEstTip ;
}

final  class pmuessn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YY2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod, BarPlf, BarAcaMar, BarEstTip FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01YY3", "UPDATE TXPBARCAD SET BarPlf=?, BarAcaMar=?, BarEstTip=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P01YY4", "SELECT EmprCod, DisCod, DisPla, DisAcaMar, DisEstTip FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01YY5", "UPDATE TXPDISPOS SET DisPla=?, DisAcaMar=?, DisEstTip=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

