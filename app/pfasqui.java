package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasqui extends GXProcedure
{
   public pfasqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasqui.class ), "" );
   }

   public pfasqui( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pfasqui.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pfasqui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasqui.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasqui.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasqui.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasqui.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV25station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pfasqui.this.GXt_char1 = GXv_char2[0] ;
      AV25station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV26usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV25station, GXv_char2, GXv_char3, GXv_char4) ;
      pfasqui.this.A396EmprCod = GXv_char2[0] ;
      pfasqui.this.AV27EmprNom = GXv_char3[0] ;
      pfasqui.this.AV26usurcod = GXv_char4[0] ;
      /* Using cursor P01OV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5369BarFasGral = P01OV2_A5369BarFasGral[0] ;
         n5369BarFasGral = P01OV2_n5369BarFasGral[0] ;
         A194BarOrdLin = P01OV2_A194BarOrdLin[0] ;
         A457FasCod = P01OV2_A457FasCod[0] ;
         if ( GXutil.strcmp(A5369BarFasGral, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.wjLoc = formatLink("app.tfasqui", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","FasCod"})  ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasqui.this.A396EmprCod;
      this.aP1[0] = pfasqui.this.A129BarCod;
      this.aP2[0] = pfasqui.this.A132BarCodReo;
      this.aP3[0] = pfasqui.this.A130BarCodPar;
      this.aP4[0] = pfasqui.this.A758ProCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV27EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV26usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P01OV2_A396EmprCod = new String[] {""} ;
      P01OV2_A129BarCod = new int[1] ;
      P01OV2_A132BarCodReo = new byte[1] ;
      P01OV2_A130BarCodPar = new String[] {""} ;
      P01OV2_A758ProCod = new String[] {""} ;
      P01OV2_A5369BarFasGral = new String[] {""} ;
      P01OV2_n5369BarFasGral = new boolean[] {false} ;
      P01OV2_A194BarOrdLin = new short[1] ;
      P01OV2_A457FasCod = new String[] {""} ;
      A5369BarFasGral = "" ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasqui__default(),
         new Object[] {
             new Object[] {
            P01OV2_A396EmprCod, P01OV2_A129BarCod, P01OV2_A132BarCodReo, P01OV2_A130BarCodPar, P01OV2_A758ProCod, P01OV2_A5369BarFasGral, P01OV2_n5369BarFasGral, P01OV2_A194BarOrdLin, P01OV2_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV25station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV27EmprNom ;
   private String GXv_char3[] ;
   private String AV26usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A5369BarFasGral ;
   private String A457FasCod ;
   private boolean n5369BarFasGral ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01OV2_A396EmprCod ;
   private int[] P01OV2_A129BarCod ;
   private byte[] P01OV2_A132BarCodReo ;
   private String[] P01OV2_A130BarCodPar ;
   private String[] P01OV2_A758ProCod ;
   private String[] P01OV2_A5369BarFasGral ;
   private boolean[] P01OV2_n5369BarFasGral ;
   private short[] P01OV2_A194BarOrdLin ;
   private String[] P01OV2_A457FasCod ;
}

final  class pfasqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01OV2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarFasGral, BarOrdLin, FasCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

