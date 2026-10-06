package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprolavs extends GXProcedure
{
   public pprolavs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprolavs.class ), "" );
   }

   public pprolavs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pprolavs.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pprolavs.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pprolavs.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pprolavs.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      pprolavs.this.AV18CliCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Actualizando....Disfas...Dislin...", "") );
      AV25Np = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P04E12 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod});
      cV25Np = P04E12_AV25Np[0] ;
      pr_default.close(0);
      AV25Np = (short)(AV25Np+cV25Np*1) ;
      /* End optimized group. */
      if ( AV25Np > 1 )
      {
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV26Tab_p[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         AV27i = (short)(1) ;
         while ( AV27i <= 100 )
         {
            if ( GXutil.strcmp(AV26Tab_p[AV27i-1], " ") == 0 )
            {
               if (true) break;
            }
            AV19ProCod = AV26Tab_p[AV27i-1] ;
            GXv_char1[0] = AV15EmprCod ;
            GXv_int2[0] = AV16DisCod ;
            GXv_char3[0] = AV19ProCod ;
            new app.ptraprocesos(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
            pprolavs.this.AV15EmprCod = GXv_char1[0] ;
            pprolavs.this.AV16DisCod = GXv_int2[0] ;
            pprolavs.this.AV19ProCod = GXv_char3[0] ;
            AV27i = (short)(AV27i+1) ;
         }
      }
      else
      {
         AV25Np = (short)(0) ;
         /* Using cursor P04E13 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P04E13_A252CliCod[0] ;
            A65ArtCod = P04E13_A65ArtCod[0] ;
            A396EmprCod = P04E13_A396EmprCod[0] ;
            A758ProCod = P04E13_A758ProCod[0] ;
            AV19ProCod = A758ProCod ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int2[0] = AV16DisCod ;
            GXv_char1[0] = AV19ProCod ;
            new app.ptraprocesos(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
            pprolavs.this.A396EmprCod = GXv_char3[0] ;
            pprolavs.this.AV16DisCod = GXv_int2[0] ;
            pprolavs.this.AV19ProCod = GXv_char1[0] ;
            AV25Np = (short)(AV25Np+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprolavs.this.AV15EmprCod;
      this.aP1[0] = pprolavs.this.AV16DisCod;
      this.aP2[0] = pprolavs.this.AV17ArtCod;
      this.aP3[0] = pprolavs.this.AV18CliCod;
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
      P04E12_AV25Np = new short[1] ;
      AV26Tab_p = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV26Tab_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV19ProCod = "" ;
      P04E13_A252CliCod = new int[1] ;
      P04E13_A65ArtCod = new String[] {""} ;
      P04E13_A396EmprCod = new String[] {""} ;
      P04E13_A758ProCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprolavs__default(),
         new Object[] {
             new Object[] {
            P04E12_AV25Np
            }
            , new Object[] {
            P04E13_A252CliCod, P04E13_A65ArtCod, P04E13_A396EmprCod, P04E13_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV25Np ;
   private short cV25Np ;
   private short AV27i ;
   private short Gx_err ;
   private int AV16DisCod ;
   private int AV18CliCod ;
   private int GX_I ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String scmdbuf ;
   private String AV26Tab_p[] ;
   private String AV19ProCod ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P04E12_AV25Np ;
   private int[] P04E13_A252CliCod ;
   private String[] P04E13_A65ArtCod ;
   private String[] P04E13_A396EmprCod ;
   private String[] P04E13_A758ProCod ;
}

final  class pprolavs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04E12", "SELECT COUNT(*) FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04E13", "SELECT CliCod, ArtCod, EmprCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

