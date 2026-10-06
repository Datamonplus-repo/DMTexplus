package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordlinobs extends GXProcedure
{
   public pordlinobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordlinobs.class ), "" );
   }

   public pordlinobs( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      pordlinobs.this.A396EmprCod = aP0;
      pordlinobs.this.AV10DisCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8i = (byte)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV9Tab_obslin[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P05XD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P05XD2_A361DisCod[0] ;
         A377DisObsTxt = P05XD2_A377DisObsTxt[0] ;
         A376DisObsLin = P05XD2_A376DisObsLin[0] ;
         if ( GXutil.strcmp(A377DisObsTxt, " ") != 0 )
         {
            AV9Tab_obslin[AV8i-1] = A377DisObsTxt ;
            AV8i = (byte)(AV8i+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P05XD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
      /* End optimized DELETE. */
      AV8i = (byte)(1) ;
      while ( AV8i <= 9 )
      {
         if ( GXutil.strcmp(AV9Tab_obslin[AV8i-1], "") == 0 )
         {
            if (true) break;
         }
         /*
            INSERT RECORD ON TABLE TXPOBSERV

         */
         A361DisCod = AV10DisCod ;
         A376DisObsLin = AV8i ;
         A377DisObsTxt = AV9Tab_obslin[AV8i-1] ;
         /* Using cursor P05XD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV8i = (byte)(AV8i+1) ;
      }
      AV8i = (byte)(AV8i-1) ;
      /* Optimized UPDATE. */
      /* Using cursor P05XD5 */
      pr_default.execute(3, new Object[] {Byte.valueOf(AV8i), Byte.valueOf(AV8i), A396EmprCod, Integer.valueOf(AV10DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pordlinobs");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Tab_obslin = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV9Tab_obslin[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P05XD2_A396EmprCod = new String[] {""} ;
      P05XD2_A361DisCod = new int[1] ;
      P05XD2_A377DisObsTxt = new String[] {""} ;
      P05XD2_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pordlinobs__default(),
         new Object[] {
             new Object[] {
            P05XD2_A396EmprCod, P05XD2_A361DisCod, P05XD2_A377DisObsTxt, P05XD2_A376DisObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8i ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV10DisCod ;
   private int GX_I ;
   private int A361DisCod ;
   private int GX_INS40 ;
   private String A396EmprCod ;
   private String AV9Tab_obslin[] ;
   private String scmdbuf ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
   private String[] P05XD2_A396EmprCod ;
   private int[] P05XD2_A361DisCod ;
   private String[] P05XD2_A377DisObsTxt ;
   private byte[] P05XD2_A376DisObsLin ;
}

final  class pordlinobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05XD2", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05XD3", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P05XD4", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P05XD5", "UPDATE TXPDISPOS SET DisObsULin=CASE  WHEN ? < 0 THEN 0 ELSE ? END  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

