package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_ctrlhashanteriorcopy1 extends GXProcedure
{
   public documentotransportecomercial_ctrlhashanteriorcopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_ctrlhashanteriorcopy1.class ), "" );
   }

   public documentotransportecomercial_ctrlhashanteriorcopy1( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 )
   {
      documentotransportecomercial_ctrlhashanteriorcopy1.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String[] aP3 )
   {
      documentotransportecomercial_ctrlhashanteriorcopy1.this.A396EmprCod = aP0;
      documentotransportecomercial_ctrlhashanteriorcopy1.this.AV8ALbProPri = aP1;
      documentotransportecomercial_ctrlhashanteriorcopy1.this.AV21albcomcod = aP2;
      documentotransportecomercial_ctrlhashanteriorcopy1.this.aP3 = aP3;
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
      documentotransportecomercial_ctrlhashanteriorcopy1.this.GXt_char1 = GXv_char2[0] ;
      AV10ddmmaaaa = GXt_char1 ;
      AV10ddmmaaaa = ((GXutil.strcmp(AV10ddmmaaaa, " ")==0) ? "02/04/12" : AV10ddmmaaaa) ;
      AV11Fecha = localUtil.ctod( AV10ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV12ContCod = ((GXutil.strcmp(AV8ALbProPri, "0")==0) ? "100012" : "100011") ;
      GXv_int3[0] = AV14ContVal ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, AV12ContCod, GXv_int3) ;
      documentotransportecomercial_ctrlhashanteriorcopy1.this.AV14ContVal = GXv_int3[0] ;
      AV17AlbComFd = "" ;
      AV15calprd = (byte)(0) ;
      /* Using cursor P0AK92 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8ALbProPri, Integer.valueOf(AV21albcomcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P0AK92_A14AlbComCod[0] ;
         A22AlbComPri = P0AK92_A22AlbComPri[0] ;
         A10740AlbComID = P0AK92_A10740AlbComID[0] ;
         A10739AlbComEAT = P0AK92_A10739AlbComEAT[0] ;
         A10014AlbComFd = P0AK92_A10014AlbComFd[0] ;
         AV20AlbComID = A10740AlbComID ;
         AV18AlbComEAT = A10739AlbComEAT ;
         AV19Albcomcodant = A14AlbComCod ;
         AV17AlbComFd = A10014AlbComFd ;
         AV15calprd = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV17AlbComFd, " ") == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! Não foi gerado o Hash da guia anterior(", "") + GXutil.trim( GXutil.str( AV19Albcomcodant, 8, 0)) + ".)" + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Notar que não podem ser comunicadas guias à AT, quando existem guias anteriores sem Hash.", "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( AV18AlbComEAT == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV19Albcomcodant, 8, 0) + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "NÃO foi enviado para a AT. Está PENDENTE.", "") + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Deve primeiro comunicar este documento à AT.", "") + GXutil.newLine( ) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! (GXutil.strcmp("", AV17AlbComFd)==0) && ( AV15calprd == 1 ) )
      {
         if ( (GXutil.strcmp("", AV20AlbComID)==0) && (0==AV18AlbComEAT) )
         {
            AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV19Albcomcodant, 8, 0) + GXutil.newLine( ) ;
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
      this.aP3[0] = documentotransportecomercial_ctrlhashanteriorcopy1.this.AV9Msg_control;
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
      AV17AlbComFd = "" ;
      scmdbuf = "" ;
      P0AK92_A396EmprCod = new String[] {""} ;
      P0AK92_A14AlbComCod = new int[1] ;
      P0AK92_A22AlbComPri = new String[] {""} ;
      P0AK92_A10740AlbComID = new String[] {""} ;
      P0AK92_A10739AlbComEAT = new byte[1] ;
      P0AK92_A10014AlbComFd = new String[] {""} ;
      A22AlbComPri = "" ;
      A10740AlbComID = "" ;
      A10014AlbComFd = "" ;
      AV20AlbComID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentotransportecomercial_ctrlhashanteriorcopy1__default(),
         new Object[] {
             new Object[] {
            P0AK92_A396EmprCod, P0AK92_A14AlbComCod, P0AK92_A22AlbComPri, P0AK92_A10740AlbComID, P0AK92_A10739AlbComEAT, P0AK92_A10014AlbComFd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15calprd ;
   private byte A10739AlbComEAT ;
   private byte AV18AlbComEAT ;
   private short Gx_err ;
   private int AV21albcomcod ;
   private int AV14ContVal ;
   private int GXv_int3[] ;
   private int A14AlbComCod ;
   private int AV19Albcomcodant ;
   private String A396EmprCod ;
   private String AV8ALbProPri ;
   private String AV10ddmmaaaa ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV12ContCod ;
   private String AV17AlbComFd ;
   private String scmdbuf ;
   private String A22AlbComPri ;
   private String A10740AlbComID ;
   private String A10014AlbComFd ;
   private String AV20AlbComID ;
   private java.util.Date AV11Fecha ;
   private boolean returnInSub ;
   private String AV9Msg_control ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK92_A396EmprCod ;
   private int[] P0AK92_A14AlbComCod ;
   private String[] P0AK92_A22AlbComPri ;
   private String[] P0AK92_A10740AlbComID ;
   private byte[] P0AK92_A10739AlbComEAT ;
   private String[] P0AK92_A10014AlbComFd ;
}

final  class documentotransportecomercial_ctrlhashanteriorcopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK92", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComPri, AlbComID, AlbComEAT, AlbComFd FROM TXPCALCOM WHERE (EmprCod = ?) AND (AlbComPri = ?) AND (AlbComCod < ?) ORDER BY EmprCod, AlbComCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

