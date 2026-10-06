package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalftx extends GXProcedure
{
   public pcalftx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalftx.class ), "" );
   }

   public pcalftx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 )
   {
      pcalftx.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      pcalftx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalftx.this.AV15Clicod = aP1[0];
      this.aP1 = aP1;
      pcalftx.this.AV16TipArtCod = aP2[0];
      this.aP2 = aP2;
      pcalftx.this.AV17MatCod = aP3[0];
      this.aP3 = aP3;
      pcalftx.this.AV18ColNomTx = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19CliALias = " " ;
      AV20CliNumc = 0 ;
      /* Using cursor P03VT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P03VT2_A252CliCod[0] ;
         A2748CliAlias = P03VT2_A2748CliAlias[0] ;
         A9901CliNumC = P03VT2_A9901CliNumC[0] ;
         AV19CliALias = A2748CliAlias ;
         AV20CliNumc = A9901CliNumC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV19CliALias, " ") == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. No hay valor en el item ALIAS", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Vea la Ficha del Cliente, item Alias", "") + GXutil.chr( (short)(13)) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20CliNumc = (int)(AV20CliNumc+1) ;
      AV25Ceros = "00000" ;
      AV23V3 = AV16TipArtCod ;
      AV26V3a = GXutil.str( AV23V3, 3, 0) ;
      AV26V3a = GXutil.ltrim( GXutil.rtrim( AV26V3a)) ;
      AV27LenV = (byte)(GXutil.len( AV26V3a)) ;
      AV27LenV = (byte)(3-AV27LenV) ;
      AV26V3a = GXutil.substring( AV25Ceros, 1, AV27LenV) + AV26V3a ;
      AV24V4 = (byte)(AV17MatCod) ;
      AV28V4a = GXutil.str( AV17MatCod, 1, 0) ;
      AV28V4a = GXutil.ltrim( GXutil.rtrim( AV28V4a)) ;
      AV27LenV = (byte)(GXutil.len( AV28V4a)) ;
      AV27LenV = (byte)(1-AV27LenV) ;
      AV28V4a = GXutil.substring( AV25Ceros, 1, AV27LenV) + AV28V4a ;
      AV29V5a = GXutil.str( AV20CliNumc, 5, 0) ;
      AV29V5a = GXutil.ltrim( GXutil.rtrim( AV29V5a)) ;
      AV27LenV = (byte)(GXutil.len( AV29V5a)) ;
      AV27LenV = (byte)(5-AV27LenV) ;
      AV29V5a = GXutil.substring( AV25Ceros, 1, AV27LenV) + AV29V5a ;
      AV21V1 = GXutil.substring( AV19CliALias, 1, 2) ;
      AV22V2 = GXutil.substring( GXutil.str( GXutil.year( GXutil.today( )), 4, 0), 3, 2) ;
      AV24V4 = (byte)(AV17MatCod) ;
      AV18ColNomTx = AV21V1 + AV22V2 + AV26V3a + AV28V4a + AV29V5a ;
      if ( GXutil.strcmp(AV30Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Using cursor P03VT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15Clicod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P03VT3_A252CliCod[0] ;
            A2748CliAlias = P03VT3_A2748CliAlias[0] ;
            A9901CliNumC = P03VT3_A9901CliNumC[0] ;
            AV19CliALias = A2748CliAlias ;
            A9901CliNumC = AV20CliNumc ;
            /* Using cursor P03VT4 */
            pr_default.execute(2, new Object[] {Integer.valueOf(A9901CliNumC), A396EmprCod, Integer.valueOf(A252CliCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         AV18ColNomTx = " " ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalftx.this.A396EmprCod;
      this.aP1[0] = pcalftx.this.AV15Clicod;
      this.aP2[0] = pcalftx.this.AV16TipArtCod;
      this.aP3[0] = pcalftx.this.AV17MatCod;
      this.aP4[0] = pcalftx.this.AV18ColNomTx;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcalftx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19CliALias = "" ;
      scmdbuf = "" ;
      P03VT2_A396EmprCod = new String[] {""} ;
      P03VT2_A252CliCod = new int[1] ;
      P03VT2_A2748CliAlias = new String[] {""} ;
      P03VT2_A9901CliNumC = new int[1] ;
      A2748CliAlias = "" ;
      Gx_msg = "" ;
      AV25Ceros = "" ;
      AV26V3a = "" ;
      AV28V4a = "" ;
      AV29V5a = "" ;
      AV21V1 = "" ;
      AV22V2 = "" ;
      AV30Ok = "" ;
      P03VT3_A396EmprCod = new String[] {""} ;
      P03VT3_A252CliCod = new int[1] ;
      P03VT3_A2748CliAlias = new String[] {""} ;
      P03VT3_A9901CliNumC = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalftx__default(),
         new Object[] {
             new Object[] {
            P03VT2_A396EmprCod, P03VT2_A252CliCod, P03VT2_A2748CliAlias, P03VT2_A9901CliNumC
            }
            , new Object[] {
            P03VT3_A396EmprCod, P03VT3_A252CliCod, P03VT3_A2748CliAlias, P03VT3_A9901CliNumC
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27LenV ;
   private byte AV24V4 ;
   private short AV16TipArtCod ;
   private short AV17MatCod ;
   private short AV23V3 ;
   private short Gx_err ;
   private int AV15Clicod ;
   private int AV20CliNumc ;
   private int A252CliCod ;
   private int A9901CliNumC ;
   private String A396EmprCod ;
   private String AV18ColNomTx ;
   private String AV19CliALias ;
   private String scmdbuf ;
   private String A2748CliAlias ;
   private String Gx_msg ;
   private String AV25Ceros ;
   private String AV26V3a ;
   private String AV28V4a ;
   private String AV29V5a ;
   private String AV21V1 ;
   private String AV22V2 ;
   private String AV30Ok ;
   private boolean returnInSub ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03VT2_A396EmprCod ;
   private int[] P03VT2_A252CliCod ;
   private String[] P03VT2_A2748CliAlias ;
   private int[] P03VT2_A9901CliNumC ;
   private String[] P03VT3_A396EmprCod ;
   private int[] P03VT3_A252CliCod ;
   private String[] P03VT3_A2748CliAlias ;
   private int[] P03VT3_A9901CliNumC ;
}

final  class pcalftx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03VT2", "SELECT EmprCod, CliCod, CliAlias, CliNumC FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03VT3", "SELECT EmprCod, CliCod, CliAlias, CliNumC FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03VT4", "UPDATE TXPCLIENT SET CliNumC=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

