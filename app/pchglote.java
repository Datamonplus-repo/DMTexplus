package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchglote extends GXProcedure
{
   public pchglote( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchglote.class ), "" );
   }

   public pchglote( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pchglote.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pchglote.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchglote.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pchglote.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pchglote.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pchglote.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pchglote.this.AV11Usurcod = aP5[0];
      this.aP5 = aP5;
      pchglote.this.AV12Station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Inc_obs = "" ;
      /* Using cursor P05XF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5725RecLote = P05XF2_A5725RecLote[0] ;
         A10881PrdLote = P05XF2_A10881PrdLote[0] ;
         A718PrdNom = P05XF2_A718PrdNom[0] ;
         A719PrdNum = P05XF2_A719PrdNum[0] ;
         n719PrdNum = P05XF2_n719PrdNum[0] ;
         A1273RecLinPro = P05XF2_A1273RecLinPro[0] ;
         A811RecLin = P05XF2_A811RecLin[0] ;
         A10881PrdLote = P05XF2_A10881PrdLote[0] ;
         A718PrdNom = P05XF2_A718PrdNom[0] ;
         AV8RecLote = A5725RecLote ;
         AV9PrdLote = A10881PrdLote ;
         if ( ( GXutil.strcmp(AV9PrdLote, AV8RecLote) != 0 ) && ( GXutil.strcmp(AV9PrdLote, " ") != 0 ) )
         {
            AV10Inc_obs = httpContext.getMessage( "Cambio LOTE ", "") + A719PrdNum + " " + A718PrdNom + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Lote Receta ", "") + GXutil.trim( AV8RecLote) + httpContext.getMessage( " se cambia por ", "") + GXutil.trim( AV9PrdLote) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV11Usurcod, AV12Station, AV10Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A5725RecLote = A10881PrdLote ;
         }
         /* Using cursor P05XF3 */
         pr_default.execute(1, new Object[] {A5725RecLote, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchglote.this.A396EmprCod;
      this.aP1[0] = pchglote.this.A129BarCod;
      this.aP2[0] = pchglote.this.A132BarCodReo;
      this.aP3[0] = pchglote.this.A130BarCodPar;
      this.aP4[0] = pchglote.this.A2804RecLinMaq;
      this.aP5[0] = pchglote.this.AV11Usurcod;
      this.aP6[0] = pchglote.this.AV12Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pchglote");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Inc_obs = "" ;
      scmdbuf = "" ;
      P05XF2_A396EmprCod = new String[] {""} ;
      P05XF2_A129BarCod = new int[1] ;
      P05XF2_A132BarCodReo = new byte[1] ;
      P05XF2_A130BarCodPar = new String[] {""} ;
      P05XF2_A2804RecLinMaq = new short[1] ;
      P05XF2_A5725RecLote = new String[] {""} ;
      P05XF2_A10881PrdLote = new String[] {""} ;
      P05XF2_A718PrdNom = new String[] {""} ;
      P05XF2_A719PrdNum = new String[] {""} ;
      P05XF2_n719PrdNum = new boolean[] {false} ;
      P05XF2_A1273RecLinPro = new byte[1] ;
      P05XF2_A811RecLin = new short[1] ;
      A5725RecLote = "" ;
      A10881PrdLote = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV8RecLote = "" ;
      AV9PrdLote = "" ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchglote__default(),
         new Object[] {
             new Object[] {
            P05XF2_A396EmprCod, P05XF2_A129BarCod, P05XF2_A132BarCodReo, P05XF2_A130BarCodPar, P05XF2_A2804RecLinMaq, P05XF2_A5725RecLote, P05XF2_A10881PrdLote, P05XF2_A718PrdNom, P05XF2_A719PrdNum, P05XF2_n719PrdNum,
            P05XF2_A1273RecLinPro, P05XF2_A811RecLin
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PChgLote" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PChgLote" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV11Usurcod ;
   private String AV12Station ;
   private String scmdbuf ;
   private String A5725RecLote ;
   private String A10881PrdLote ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV8RecLote ;
   private String AV9PrdLote ;
   private String AV16Pgmname ;
   private boolean n719PrdNum ;
   private String AV10Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05XF2_A396EmprCod ;
   private int[] P05XF2_A129BarCod ;
   private byte[] P05XF2_A132BarCodReo ;
   private String[] P05XF2_A130BarCodPar ;
   private short[] P05XF2_A2804RecLinMaq ;
   private String[] P05XF2_A5725RecLote ;
   private String[] P05XF2_A10881PrdLote ;
   private String[] P05XF2_A718PrdNom ;
   private String[] P05XF2_A719PrdNum ;
   private boolean[] P05XF2_n719PrdNum ;
   private byte[] P05XF2_A1273RecLinPro ;
   private short[] P05XF2_A811RecLin ;
}

final  class pchglote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05XF2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote, T2.PrdLote, T2.PrdNom, T1.PrdNum, T1.RecLinPro, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05XF3", "UPDATE TXPLRECET SET RecLote=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

