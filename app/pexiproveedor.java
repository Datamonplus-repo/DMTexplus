package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexiproveedor extends GXProcedure
{
   public pexiproveedor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexiproveedor.class ), "" );
   }

   public pexiproveedor( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 )
   {
      pexiproveedor.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pexiproveedor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexiproveedor.this.A795PrvNum = aP1[0];
      this.aP1 = aP1;
      pexiproveedor.this.AV11AlbProInEx = aP2[0];
      this.aP2 = aP2;
      pexiproveedor.this.AV8Flag = aP3[0];
      this.aP3 = aP3;
      pexiproveedor.this.AV10MsgErr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV14Endutex) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int2) ;
      pexiproveedor.this.GXt_int1 = GXv_int2[0] ;
      AV14Endutex = GXt_int1 ;
      AV12Mercado = ((AV11AlbProInEx==1) ? httpContext.getMessage( "Interno", "") : httpContext.getMessage( "Externo", "")) ;
      AV9PrvTipo = ((AV11AlbProInEx==1) ? httpContext.getMessage( "I", "") : httpContext.getMessage( "E", "")) ;
      AV10MsgErr = " " ;
      AV17GXLvl5 = (byte)(0) ;
      /* Using cursor P05YY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13585PrvTipo = P05YY2_A13585PrvTipo[0] ;
         n13585PrvTipo = P05YY2_n13585PrvTipo[0] ;
         AV17GXLvl5 = (byte)(1) ;
         AV8Flag = (byte)(1) ;
         AV13PrvtipoIn = ((GXutil.strcmp(A13585PrvTipo, httpContext.getMessage( "I", ""))==0) ? httpContext.getMessage( "Interno", "") : httpContext.getMessage( "Externo", "")) ;
         if ( ( GXutil.strcmp(AV9PrvTipo, A13585PrvTipo) != 0 ) && ( AV14Endutex == 1 ) )
         {
            AV10MsgErr = httpContext.getMessage( "Atencion. El proveedor esta como ", "") + AV13PrvtipoIn + GXutil.newLine( ) ;
            AV10MsgErr += httpContext.getMessage( "Y el documento se digito ", "") + AV12Mercado ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl5 == 0 )
      {
         AV8Flag = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexiproveedor.this.A396EmprCod;
      this.aP1[0] = pexiproveedor.this.A795PrvNum;
      this.aP2[0] = pexiproveedor.this.AV11AlbProInEx;
      this.aP3[0] = pexiproveedor.this.AV8Flag;
      this.aP4[0] = pexiproveedor.this.AV10MsgErr;
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
      AV12Mercado = "" ;
      AV9PrvTipo = "" ;
      scmdbuf = "" ;
      P05YY2_A396EmprCod = new String[] {""} ;
      P05YY2_A795PrvNum = new int[1] ;
      P05YY2_A13585PrvTipo = new String[] {""} ;
      P05YY2_n13585PrvTipo = new boolean[] {false} ;
      A13585PrvTipo = "" ;
      AV13PrvtipoIn = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexiproveedor__default(),
         new Object[] {
             new Object[] {
            P05YY2_A396EmprCod, P05YY2_A795PrvNum, P05YY2_A13585PrvTipo, P05YY2_n13585PrvTipo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11AlbProInEx ;
   private byte AV8Flag ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV17GXLvl5 ;
   private short AV14Endutex ;
   private short Gx_err ;
   private int A795PrvNum ;
   private String A396EmprCod ;
   private String AV10MsgErr ;
   private String AV12Mercado ;
   private String AV9PrvTipo ;
   private String scmdbuf ;
   private String A13585PrvTipo ;
   private String AV13PrvtipoIn ;
   private boolean n13585PrvTipo ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05YY2_A396EmprCod ;
   private int[] P05YY2_A795PrvNum ;
   private String[] P05YY2_A13585PrvTipo ;
   private boolean[] P05YY2_n13585PrvTipo ;
}

final  class pexiproveedor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05YY2", "SELECT EmprCod, PrvNum, PrvTipo FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
      }
   }

}

