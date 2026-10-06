package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pagrrec1 extends GXProcedure
{
   public pagrrec1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pagrrec1.class ), "" );
   }

   public pagrrec1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 )
   {
      pagrrec1.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      pagrrec1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pagrrec1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pagrrec1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pagrrec1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pagrrec1.this.AV8Maqcod = aP4[0];
      this.aP4 = aP4;
      pagrrec1.this.AV9Recvolprd = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pagrrec1.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      pagrrec1.this.A396EmprCod = GXv_char2[0] ;
      pagrrec1.this.AV13EmprNom = GXv_char3[0] ;
      pagrrec1.this.AV14UsurCod = GXv_char4[0] ;
      GXt_int5 = AV16etm ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int6) ;
      pagrrec1.this.GXt_int5 = GXv_int6[0] ;
      AV16etm = GXt_int5 ;
      /* Using cursor P06152 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A180BarMaqCod = P06152_A180BarMaqCod[0] ;
         A236BarVolMaq = P06152_A236BarVolMaq[0] ;
         A3594BarPriTin = P06152_A3594BarPriTin[0] ;
         AV15Inc_obs = httpContext.getMessage( "Agrupacion.Cambio Datos BARCAD", "") + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Maquina  ", "") + A180BarMaqCod + " -> " + AV8Maqcod + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Volumen  ", "") + GXutil.str( A236BarVolMaq, 5, 0) + " -> " + GXutil.str( AV9Recvolprd, 5, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname, AV14UsurCod, AV12Station, AV15Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A3594BarPriTin = (byte)(((AV16etm==0) ? A3594BarPriTin : ((GXutil.strcmp(A180BarMaqCod, AV8Maqcod)!=0) ? 80 : A3594BarPriTin))) ;
         A236BarVolMaq = AV9Recvolprd ;
         A180BarMaqCod = AV8Maqcod ;
         /* Using cursor P06153 */
         pr_default.execute(1, new Object[] {A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Byte.valueOf(A3594BarPriTin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pagrrec1.this.A396EmprCod;
      this.aP1[0] = pagrrec1.this.A129BarCod;
      this.aP2[0] = pagrrec1.this.A132BarCodReo;
      this.aP3[0] = pagrrec1.this.A130BarCodPar;
      this.aP4[0] = pagrrec1.this.AV8Maqcod;
      this.aP5[0] = pagrrec1.this.AV9Recvolprd;
      Application.commitDataStores(context, remoteHandle, pr_default, "pagrrec1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P06152_A396EmprCod = new String[] {""} ;
      P06152_A129BarCod = new int[1] ;
      P06152_A132BarCodReo = new byte[1] ;
      P06152_A130BarCodPar = new String[] {""} ;
      P06152_A180BarMaqCod = new String[] {""} ;
      P06152_A236BarVolMaq = new int[1] ;
      P06152_A3594BarPriTin = new byte[1] ;
      A180BarMaqCod = "" ;
      AV15Inc_obs = "" ;
      AV20Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pagrrec1__default(),
         new Object[] {
             new Object[] {
            P06152_A396EmprCod, P06152_A129BarCod, P06152_A132BarCodReo, P06152_A130BarCodPar, P06152_A180BarMaqCod, P06152_A236BarVolMaq, P06152_A3594BarPriTin
            }
            , new Object[] {
            }
         }
      );
      AV20Pgmname = "PAgrREC1" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PAgrREC1" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV16etm ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A3594BarPriTin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Recvolprd ;
   private int A236BarVolMaq ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Maqcod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private String AV20Pgmname ;
   private String AV15Inc_obs ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P06152_A396EmprCod ;
   private int[] P06152_A129BarCod ;
   private byte[] P06152_A132BarCodReo ;
   private String[] P06152_A130BarCodPar ;
   private String[] P06152_A180BarMaqCod ;
   private int[] P06152_A236BarVolMaq ;
   private byte[] P06152_A3594BarPriTin ;
}

final  class pagrrec1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06152", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarVolMaq, BarPriTin FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P06153", "UPDATE TXPBARCAD SET BarMaqCod=?, BarVolMaq=?, BarPriTin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

