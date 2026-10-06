package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac033 extends GXProcedure
{
   public prac033( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac033.class ), "" );
   }

   public prac033( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      prac033.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      prac033.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prac033.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prac033.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prac033.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV8Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      prac033.this.GXt_char1 = GXv_char2[0] ;
      AV8Station = GXt_char1 ;
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char2, GXv_char3, GXv_char4) ;
      prac033.this.AV9EmprCod = GXv_char2[0] ;
      prac033.this.AV10EmprNom = GXv_char3[0] ;
      prac033.this.AV11UsurCod = GXv_char4[0] ;
      AV12Inc_obs = "" ;
      /* Using cursor P04132 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4017BarInci = P04132_A4017BarInci[0] ;
         AV12Inc_obs = httpContext.getMessage( "Barcad. Actualizo BarInci ", "") + GXutil.trim( GXutil.str( A4017BarInci, 1, 0)) + httpContext.getMessage( " con valor 0", "") ;
         A4017BarInci = (byte)(0) ;
         /* Using cursor P04133 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A4017BarInci), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV12Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV11UsurCod, AV8Station, AV12Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac033.this.A396EmprCod;
      this.aP1[0] = prac033.this.A129BarCod;
      this.aP2[0] = prac033.this.A132BarCodReo;
      this.aP3[0] = prac033.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "prac033");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Station = "" ;
      GXt_char1 = "" ;
      AV9EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV11UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV12Inc_obs = "" ;
      scmdbuf = "" ;
      P04132_A396EmprCod = new String[] {""} ;
      P04132_A129BarCod = new int[1] ;
      P04132_A132BarCodReo = new byte[1] ;
      P04132_A130BarCodPar = new String[] {""} ;
      P04132_A4017BarInci = new byte[1] ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac033__default(),
         new Object[] {
             new Object[] {
            P04132_A396EmprCod, P04132_A129BarCod, P04132_A132BarCodReo, P04132_A130BarCodPar, P04132_A4017BarInci
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PRAC033" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PRAC033" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A4017BarInci ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Station ;
   private String GXt_char1 ;
   private String AV9EmprCod ;
   private String GXv_char2[] ;
   private String AV10EmprNom ;
   private String GXv_char3[] ;
   private String AV11UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV16Pgmname ;
   private String AV12Inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04132_A396EmprCod ;
   private int[] P04132_A129BarCod ;
   private byte[] P04132_A132BarCodReo ;
   private String[] P04132_A130BarCodPar ;
   private byte[] P04132_A4017BarInci ;
}

final  class prac033__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04132", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarInci FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04133", "UPDATE TXPBARCAD SET BarInci=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

