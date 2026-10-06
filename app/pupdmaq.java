package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdmaq extends GXProcedure
{
   public pupdmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdmaq.class ), "" );
   }

   public pupdmaq( int remoteHandle ,
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
      pupdmaq.this.aP4 = new String[] {""};
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
      pupdmaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdmaq.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pupdmaq.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pupdmaq.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pupdmaq.this.AV8BarMaqCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      pupdmaq.this.A396EmprCod = GXv_char1[0] ;
      pupdmaq.this.AV10EmprNom = GXv_char2[0] ;
      pupdmaq.this.AV11UsurCod = GXv_char3[0] ;
      /* Using cursor P02UF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A180BarMaqCod = P02UF2_A180BarMaqCod[0] ;
         AV15Inc_obs = httpContext.getMessage( "Vengo de BarAgr.Cambio Maquina en BARCAD", "") + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Maquina ", "") + GXutil.trim( A180BarMaqCod) + httpContext.getMessage( " se cambia por ", "") + AV8BarMaqCod ;
         A180BarMaqCod = AV8BarMaqCod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV11UsurCod, AV9Station, AV15Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char1[0] = AV8BarMaqCod ;
         GXv_char6[0] = AV11UsurCod ;
         GXv_char7[0] = AV9Station ;
         new app.pprc107(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_char1, GXv_char6, GXv_char7) ;
         pupdmaq.this.A396EmprCod = GXv_char3[0] ;
         pupdmaq.this.A129BarCod = GXv_int4[0] ;
         pupdmaq.this.A132BarCodReo = GXv_int5[0] ;
         pupdmaq.this.A130BarCodPar = GXv_char2[0] ;
         pupdmaq.this.AV8BarMaqCod = GXv_char1[0] ;
         pupdmaq.this.AV11UsurCod = GXv_char6[0] ;
         pupdmaq.this.AV9Station = GXv_char7[0] ;
         /* Using cursor P02UF3 */
         pr_default.execute(1, new Object[] {A180BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdmaq.this.A396EmprCod;
      this.aP1[0] = pupdmaq.this.A129BarCod;
      this.aP2[0] = pupdmaq.this.A132BarCodReo;
      this.aP3[0] = pupdmaq.this.A130BarCodPar;
      this.aP4[0] = pupdmaq.this.AV8BarMaqCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdmaq");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Station = "" ;
      AV10EmprNom = "" ;
      AV11UsurCod = "" ;
      scmdbuf = "" ;
      P02UF2_A396EmprCod = new String[] {""} ;
      P02UF2_A129BarCod = new int[1] ;
      P02UF2_A132BarCodReo = new byte[1] ;
      P02UF2_A130BarCodPar = new String[] {""} ;
      P02UF2_A180BarMaqCod = new String[] {""} ;
      A180BarMaqCod = "" ;
      AV15Inc_obs = "" ;
      AV16Pgmname = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdmaq__default(),
         new Object[] {
             new Object[] {
            P02UF2_A396EmprCod, P02UF2_A129BarCod, P02UF2_A132BarCodReo, P02UF2_A130BarCodPar, P02UF2_A180BarMaqCod
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PUPDMAQ" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PUPDMAQ" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarMaqCod ;
   private String AV9Station ;
   private String AV10EmprNom ;
   private String AV11UsurCod ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private String AV16Pgmname ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String AV15Inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02UF2_A396EmprCod ;
   private int[] P02UF2_A129BarCod ;
   private byte[] P02UF2_A132BarCodReo ;
   private String[] P02UF2_A130BarCodPar ;
   private String[] P02UF2_A180BarMaqCod ;
}

final  class pupdmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UF2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02UF3", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

