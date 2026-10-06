package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class placrobs extends GXProcedure
{
   public placrobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( placrobs.class ), "" );
   }

   public placrobs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      placrobs.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      placrobs.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      placrobs.this.AV9DisCod = aP1[0];
      this.aP1 = aP1;
      placrobs.this.AV13DisCodL = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Linha = (byte)(0) ;
      /* Using cursor P02O82 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV13DisCodL)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02O82_A361DisCod[0] ;
         A396EmprCod = P02O82_A396EmprCod[0] ;
         A377DisObsTxt = P02O82_A377DisObsTxt[0] ;
         A376DisObsLin = P02O82_A376DisObsLin[0] ;
         AV14Linha = (byte)(AV14Linha+5) ;
         GXv_char1[0] = AV8EmprCod ;
         GXv_int2[0] = AV9DisCod ;
         GXv_int3[0] = AV14Linha ;
         GXv_char4[0] = A377DisObsTxt ;
         new app.pcpyobsd(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
         placrobs.this.AV8EmprCod = GXv_char1[0] ;
         placrobs.this.AV9DisCod = GXv_int2[0] ;
         placrobs.this.AV14Linha = GXv_int3[0] ;
         placrobs.this.A377DisObsTxt = GXv_char4[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14Linha > 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P02O83 */
         byte AV14Linha378Aux;
         AV14Linha378Aux = AV14Linha ;
         pr_default.execute(1, new Object[] {Byte.valueOf(AV14Linha378Aux), AV8EmprCod, Integer.valueOf(AV9DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = placrobs.this.AV8EmprCod;
      this.aP1[0] = placrobs.this.AV9DisCod;
      this.aP2[0] = placrobs.this.AV13DisCodL;
      Application.commitDataStores(context, remoteHandle, pr_default, "placrobs");
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
      P02O82_A361DisCod = new int[1] ;
      P02O82_A396EmprCod = new String[] {""} ;
      P02O82_A377DisObsTxt = new String[] {""} ;
      P02O82_A376DisObsLin = new byte[1] ;
      A396EmprCod = "" ;
      A377DisObsTxt = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.placrobs__default(),
         new Object[] {
             new Object[] {
            P02O82_A361DisCod, P02O82_A396EmprCod, P02O82_A377DisObsTxt, P02O82_A376DisObsLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Linha ;
   private byte A376DisObsLin ;
   private byte GXv_int3[] ;
   private byte A378DisObsULin ;
   private short Gx_err ;
   private int AV9DisCod ;
   private int AV13DisCodL ;
   private int A361DisCod ;
   private int GXv_int2[] ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A377DisObsTxt ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P02O82_A361DisCod ;
   private String[] P02O82_A396EmprCod ;
   private String[] P02O82_A377DisObsTxt ;
   private byte[] P02O82_A376DisObsLin ;
}

final  class placrobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02O82", "SELECT DisCod, EmprCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02O83", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

