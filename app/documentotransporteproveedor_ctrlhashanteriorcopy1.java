package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_ctrlhashanteriorcopy1 extends GXProcedure
{
   public documentotransporteproveedor_ctrlhashanteriorcopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_ctrlhashanteriorcopy1.class ), "" );
   }

   public documentotransporteproveedor_ctrlhashanteriorcopy1( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      documentotransporteproveedor_ctrlhashanteriorcopy1.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      documentotransporteproveedor_ctrlhashanteriorcopy1.this.A396EmprCod = aP0;
      documentotransporteproveedor_ctrlhashanteriorcopy1.this.AV17AlbProID = aP1;
      documentotransporteproveedor_ctrlhashanteriorcopy1.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Msg_control = " " ;
      GXt_char1 = AV10ddmmaaaa ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char2) ;
      documentotransporteproveedor_ctrlhashanteriorcopy1.this.GXt_char1 = GXv_char2[0] ;
      AV10ddmmaaaa = GXt_char1 ;
      AV10ddmmaaaa = ((GXutil.strcmp(AV10ddmmaaaa, " ")==0) ? "02/04/12" : AV10ddmmaaaa) ;
      AV11Fecha = localUtil.ctod( AV10ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV12ContCod = httpContext.getMessage( "REMTRA", "") ;
      GXv_int3[0] = AV14ContVal ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, AV12ContCod, GXv_int3) ;
      documentotransporteproveedor_ctrlhashanteriorcopy1.this.AV14ContVal = GXv_int3[0] ;
      AV13AlbFmd = " " ;
      AV15calprd = (byte)(0) ;
      /* Using cursor P0AK32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV17AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13418AlbProID = P0AK32_A13418AlbProID[0] ;
         A13433AlbProHh = P0AK32_A13433AlbProHh[0] ;
         A13436AlbProIDAT = P0AK32_A13436AlbProIDAT[0] ;
         A13438AlbProStAT = P0AK32_A13438AlbProStAT[0] ;
         AV13AlbFmd = A13433AlbProHh ;
         AV15calprd = (byte)(1) ;
         AV13AlbFmd = A13433AlbProHh ;
         AV18DevCruAtId = A13436AlbProIDAT ;
         AV19DevCruEnvAt = A13438AlbProStAT ;
         AV20DevCruIdant = A13418AlbProID ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV13AlbFmd, " ") == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! Não foi gerado o Hash da guia anterior(", "") + GXutil.trim( GXutil.str( AV20DevCruIdant, 8, 0)) + ".)" + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Notar que não podem ser comunicadas guias à AT, quando existem guias anteriores sem Hash.", "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( AV19DevCruEnvAt == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV20DevCruIdant, 8, 0) + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "NÃO foi enviado para a AT. Está PENDENTE.", "") + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Deve primeiro comunicar este documento à AT.", "") + GXutil.newLine( ) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! (GXutil.strcmp("", AV13AlbFmd)==0) && ( AV15calprd == 1 ) )
      {
         if ( (GXutil.strcmp("", AV18DevCruAtId)==0) && (0==AV19DevCruEnvAt) )
         {
            AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV20DevCruIdant, 8, 0) + GXutil.newLine( ) ;
            AV9Msg_control += httpContext.getMessage( "Tem um código hash, mas não tem um código AT.", "") + GXutil.newLine( ) ;
            AV9Msg_control += httpContext.getMessage( "Deve primeiro comunicar este documento à AT.", "") + GXutil.newLine( ) ;
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentotransporteproveedor_ctrlhashanteriorcopy1.this.AV9Msg_control;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Msg_control = "" ;
      AV10ddmmaaaa = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11Fecha = GXutil.nullDate() ;
      AV12ContCod = "" ;
      GXv_int3 = new int[1] ;
      AV13AlbFmd = "" ;
      scmdbuf = "" ;
      P0AK32_A396EmprCod = new String[] {""} ;
      P0AK32_A13418AlbProID = new int[1] ;
      P0AK32_A13433AlbProHh = new String[] {""} ;
      P0AK32_A13436AlbProIDAT = new String[] {""} ;
      P0AK32_A13438AlbProStAT = new byte[1] ;
      A13433AlbProHh = "" ;
      A13436AlbProIDAT = "" ;
      AV18DevCruAtId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproveedor_ctrlhashanteriorcopy1__default(),
         new Object[] {
             new Object[] {
            P0AK32_A396EmprCod, P0AK32_A13418AlbProID, P0AK32_A13433AlbProHh, P0AK32_A13436AlbProIDAT, P0AK32_A13438AlbProStAT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15calprd ;
   private byte A13438AlbProStAT ;
   private byte AV19DevCruEnvAt ;
   private short Gx_err ;
   private int AV17AlbProID ;
   private int AV14ContVal ;
   private int GXv_int3[] ;
   private int A13418AlbProID ;
   private int AV20DevCruIdant ;
   private String A396EmprCod ;
   private String AV10ddmmaaaa ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV12ContCod ;
   private String scmdbuf ;
   private String A13436AlbProIDAT ;
   private String AV18DevCruAtId ;
   private java.util.Date AV11Fecha ;
   private boolean returnInSub ;
   private String AV9Msg_control ;
   private String AV13AlbFmd ;
   private String A13433AlbProHh ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK32_A396EmprCod ;
   private int[] P0AK32_A13418AlbProID ;
   private String[] P0AK32_A13433AlbProHh ;
   private String[] P0AK32_A13436AlbProIDAT ;
   private byte[] P0AK32_A13438AlbProStAT ;
}

final  class documentotransporteproveedor_ctrlhashanteriorcopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK32", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProHh, AlbProIDAT, AlbProStAT FROM TXPCALPRO WHERE (EmprCod = ?) AND (AlbProID < ?) ORDER BY EmprCod, AlbProID DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
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
               return;
      }
   }

}

