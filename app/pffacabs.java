package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pffacabs extends GXProcedure
{
   public pffacabs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pffacabs.class ), "" );
   }

   public pffacabs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pffacabs.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 )
   {
      pffacabs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pffacabs.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pffacabs.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pffacabs.this.AV10ArtFacAbs = aP3[0];
      this.aP3 = aP3;
      pffacabs.this.Gx_mode = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      pffacabs.this.GXt_int1 = GXv_int2[0] ;
      AV11Tinamar = GXt_int1 ;
      GXt_int1 = AV12Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pffacabs.this.GXt_int1 = GXv_int2[0] ;
      AV12Moda21 = GXt_int1 ;
      GXt_int1 = AV13erfoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      pffacabs.this.GXt_int1 = GXv_int2[0] ;
      AV13erfoc = GXt_int1 ;
      GXt_int1 = AV14Facabs ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIFABS", ""), GXv_int2) ;
      pffacabs.this.GXt_int1 = GXv_int2[0] ;
      AV14Facabs = GXt_int1 ;
      /* Using cursor P01ID2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2791ArtFacAbs = P01ID2_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P01ID2_n2791ArtFacAbs[0] ;
         A9801ArtFabsT = P01ID2_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P01ID2_n9801ArtFabsT[0] ;
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
         {
            if ( ( AV12Moda21 == 1 ) || ( AV13erfoc == 1 ) || ( AV14Facabs == 1 ) )
            {
               A2791ArtFacAbs = AV10ArtFacAbs ;
               n2791ArtFacAbs = false ;
            }
            A9801ArtFabsT = AV10ArtFacAbs ;
            n9801ArtFabsT = false ;
         }
         else
         {
            AV10ArtFacAbs = A2791ArtFacAbs ;
            if ( A9801ArtFabsT.doubleValue() > 0 )
            {
               AV10ArtFacAbs = A9801ArtFabsT ;
            }
         }
         /* Using cursor P01ID3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n9801ArtFabsT), A9801ArtFabsT, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV10ArtFacAbs.doubleValue() == 0 ) && ( AV11Tinamar == 1 ) && ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) != 0 ) )
      {
         AV10ArtFacAbs = DecimalUtil.doubleToDec(2) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pffacabs.this.A396EmprCod;
      this.aP1[0] = pffacabs.this.A252CliCod;
      this.aP2[0] = pffacabs.this.A65ArtCod;
      this.aP3[0] = pffacabs.this.AV10ArtFacAbs;
      this.aP4[0] = pffacabs.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pffacabs");
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
      P01ID2_A396EmprCod = new String[] {""} ;
      P01ID2_A252CliCod = new int[1] ;
      P01ID2_A65ArtCod = new String[] {""} ;
      P01ID2_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ID2_n2791ArtFacAbs = new boolean[] {false} ;
      P01ID2_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01ID2_n9801ArtFabsT = new boolean[] {false} ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pffacabs__default(),
         new Object[] {
             new Object[] {
            P01ID2_A396EmprCod, P01ID2_A252CliCod, P01ID2_A65ArtCod, P01ID2_A2791ArtFacAbs, P01ID2_n2791ArtFacAbs, P01ID2_A9801ArtFabsT, P01ID2_n9801ArtFabsT
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Tinamar ;
   private byte AV12Moda21 ;
   private byte AV13erfoc ;
   private byte AV14Facabs ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV10ArtFacAbs ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private boolean n2791ArtFacAbs ;
   private boolean n9801ArtFabsT ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01ID2_A396EmprCod ;
   private int[] P01ID2_A252CliCod ;
   private String[] P01ID2_A65ArtCod ;
   private java.math.BigDecimal[] P01ID2_A2791ArtFacAbs ;
   private boolean[] P01ID2_n2791ArtFacAbs ;
   private java.math.BigDecimal[] P01ID2_A9801ArtFabsT ;
   private boolean[] P01ID2_n9801ArtFabsT ;
}

final  class pffacabs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ID2", "SELECT EmprCod, CliCod, ArtCod, ArtFacAbs, ArtFabsT FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01ID3", "UPDATE TXPARTICU SET ArtFacAbs=?, ArtFabsT=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               return;
      }
   }

}

