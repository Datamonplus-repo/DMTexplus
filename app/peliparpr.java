package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliparpr extends GXProcedure
{
   public peliparpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliparpr.class ), "" );
   }

   public peliparpr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      peliparpr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 )
   {
      peliparpr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliparpr.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      peliparpr.this.A558HisProFec = aP2[0];
      this.aP2 = aP2;
      peliparpr.this.AV15ActuHDR = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01152 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P01152_A561HisProLin[0] ;
         A556HisProEst = P01152_A556HisProEst[0] ;
         A129BarCod = P01152_A129BarCod[0] ;
         A132BarCodReo = P01152_A132BarCodReo[0] ;
         A130BarCodPar = P01152_A130BarCodPar[0] ;
         A194BarOrdLin = P01152_A194BarOrdLin[0] ;
         if ( A556HisProEst != 9 )
         {
            /* Using cursor P01153 */
            pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         }
         if ( GXutil.strcmp(AV15ActuHDR, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int5[0] = A194BarOrdLin ;
            new app.lectoroptico.pacfbar3(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5) ;
            peliparpr.this.A396EmprCod = GXv_char1[0] ;
            peliparpr.this.A129BarCod = GXv_int2[0] ;
            peliparpr.this.A132BarCodReo = GXv_int3[0] ;
            peliparpr.this.A130BarCodPar = GXv_char4[0] ;
            peliparpr.this.A194BarOrdLin = GXv_int5[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliparpr.this.A396EmprCod;
      this.aP1[0] = peliparpr.this.A602MaqCod;
      this.aP2[0] = peliparpr.this.A558HisProFec;
      this.aP3[0] = peliparpr.this.AV15ActuHDR;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliparpr");
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
      P01152_A396EmprCod = new String[] {""} ;
      P01152_A602MaqCod = new String[] {""} ;
      P01152_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01152_A561HisProLin = new int[1] ;
      P01152_A556HisProEst = new byte[1] ;
      P01152_A129BarCod = new int[1] ;
      P01152_A132BarCodReo = new byte[1] ;
      P01152_A130BarCodPar = new String[] {""} ;
      P01152_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliparpr__default(),
         new Object[] {
             new Object[] {
            P01152_A396EmprCod, P01152_A602MaqCod, P01152_A558HisProFec, P01152_A561HisProLin, P01152_A556HisProEst, P01152_A129BarCod, P01152_A132BarCodReo, P01152_A130BarCodPar, P01152_A194BarOrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short A194BarOrdLin ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV15ActuHDR ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private java.util.Date A558HisProFec ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01152_A396EmprCod ;
   private String[] P01152_A602MaqCod ;
   private java.util.Date[] P01152_A558HisProFec ;
   private int[] P01152_A561HisProLin ;
   private byte[] P01152_A556HisProEst ;
   private int[] P01152_A129BarCod ;
   private byte[] P01152_A132BarCodReo ;
   private String[] P01152_A130BarCodPar ;
   private short[] P01152_A194BarOrdLin ;
}

final  class peliparpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01152", "SELECT EmprCod, MaqCod, HisProFec, HisProLin, HisProEst, BarCod, BarCodReo, BarCodPar, BarOrdLin FROM TXPLHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01153", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

