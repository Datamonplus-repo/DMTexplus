package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plotescupdate extends GXProcedure
{
   public plotescupdate( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plotescupdate.class ), "" );
   }

   public plotescupdate( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      plotescupdate.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        short[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      plotescupdate.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plotescupdate.this.A4492HreBarCod = aP1[0];
      this.aP1 = aP1;
      plotescupdate.this.A4493HreBarReo = aP2[0];
      this.aP2 = aP2;
      plotescupdate.this.A4494HreBarPar = aP3[0];
      this.aP3 = aP3;
      plotescupdate.this.A4495HreNumCie = aP4[0];
      this.aP4 = aP4;
      plotescupdate.this.A4545HreLinMaq = aP5[0];
      this.aP5 = aP5;
      plotescupdate.this.A4550HreLinPro = aP6[0];
      this.aP6 = aP6;
      plotescupdate.this.A4557HreRecLin = aP7[0];
      this.aP7 = aP7;
      plotescupdate.this.AV10Prdnum = aP8[0];
      this.aP8 = aP8;
      plotescupdate.this.AV8HreLote = aP9[0];
      this.aP9 = aP9;
      plotescupdate.this.AV12Usurcod = aP10[0];
      this.aP10 = aP10;
      plotescupdate.this.AV13station = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05SJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5726HreLote = P05SJ2_A5726HreLote[0] ;
         n5726HreLote = P05SJ2_n5726HreLote[0] ;
         AV14Inc_obs = httpContext.getMessage( "HISLRE.Producto", "") + AV10Prdnum + GXutil.newLine( ) ;
         AV14Inc_obs += "#       " + GXutil.str( A4495HreNumCie, 2, 0) + GXutil.newLine( ) ;
         AV14Inc_obs += "##      " + GXutil.str( A4545HreLinMaq, 4, 0) + GXutil.newLine( ) ;
         AV14Inc_obs += "###     " + GXutil.str( A4550HreLinPro, 2, 0) + GXutil.newLine( ) ;
         AV14Inc_obs += "####    " + GXutil.str( A4557HreRecLin, 4, 0) + GXutil.newLine( ) ;
         AV14Inc_obs += httpContext.getMessage( "Cambio Lote ", "") + A5726HreLote + httpContext.getMessage( " por ", "") + AV8HreLote + GXutil.newLine( ) ;
         A5726HreLote = AV8HreLote ;
         n5726HreLote = false ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV18Pgmname, 1, 10), AV12Usurcod, AV13station, AV14Inc_obs, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar) ;
         /* Using cursor P05SJ3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5726HreLote), A5726HreLote, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plotescupdate.this.A396EmprCod;
      this.aP1[0] = plotescupdate.this.A4492HreBarCod;
      this.aP2[0] = plotescupdate.this.A4493HreBarReo;
      this.aP3[0] = plotescupdate.this.A4494HreBarPar;
      this.aP4[0] = plotescupdate.this.A4495HreNumCie;
      this.aP5[0] = plotescupdate.this.A4545HreLinMaq;
      this.aP6[0] = plotescupdate.this.A4550HreLinPro;
      this.aP7[0] = plotescupdate.this.A4557HreRecLin;
      this.aP8[0] = plotescupdate.this.AV10Prdnum;
      this.aP9[0] = plotescupdate.this.AV8HreLote;
      this.aP10[0] = plotescupdate.this.AV12Usurcod;
      this.aP11[0] = plotescupdate.this.AV13station;
      Application.commitDataStores(context, remoteHandle, pr_default, "plotescupdate");
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
      P05SJ2_A396EmprCod = new String[] {""} ;
      P05SJ2_A4492HreBarCod = new int[1] ;
      P05SJ2_A4493HreBarReo = new byte[1] ;
      P05SJ2_A4494HreBarPar = new String[] {""} ;
      P05SJ2_A4495HreNumCie = new byte[1] ;
      P05SJ2_A4545HreLinMaq = new short[1] ;
      P05SJ2_A4550HreLinPro = new byte[1] ;
      P05SJ2_A4557HreRecLin = new short[1] ;
      P05SJ2_A5726HreLote = new String[] {""} ;
      P05SJ2_n5726HreLote = new boolean[] {false} ;
      A5726HreLote = "" ;
      AV14Inc_obs = "" ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plotescupdate__default(),
         new Object[] {
             new Object[] {
            P05SJ2_A396EmprCod, P05SJ2_A4492HreBarCod, P05SJ2_A4493HreBarReo, P05SJ2_A4494HreBarPar, P05SJ2_A4495HreNumCie, P05SJ2_A4545HreLinMaq, P05SJ2_A4550HreLinPro, P05SJ2_A4557HreRecLin, P05SJ2_A5726HreLote, P05SJ2_n5726HreLote
            }
            , new Object[] {
            }
         }
      );
      AV18Pgmname = "PLoteSCUpdate" ;
      /* GeneXus formulas. */
      AV18Pgmname = "PLoteSCUpdate" ;
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV10Prdnum ;
   private String AV8HreLote ;
   private String AV12Usurcod ;
   private String AV13station ;
   private String scmdbuf ;
   private String A5726HreLote ;
   private String AV18Pgmname ;
   private boolean n5726HreLote ;
   private String AV14Inc_obs ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private short[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P05SJ2_A396EmprCod ;
   private int[] P05SJ2_A4492HreBarCod ;
   private byte[] P05SJ2_A4493HreBarReo ;
   private String[] P05SJ2_A4494HreBarPar ;
   private byte[] P05SJ2_A4495HreNumCie ;
   private short[] P05SJ2_A4545HreLinMaq ;
   private byte[] P05SJ2_A4550HreLinPro ;
   private short[] P05SJ2_A4557HreRecLin ;
   private String[] P05SJ2_A5726HreLote ;
   private boolean[] P05SJ2_n5726HreLote ;
}

final  class plotescupdate__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SJ2", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin, HreLote FROM TXPHISLRE WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? and HreRecLin = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05SJ3", "UPDATE TXPHISLRE SET HreLote=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? AND HreRecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
      }
   }

}

