package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptubetx extends GXProcedure
{
   public ptubetx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptubetx.class ), "" );
   }

   public ptubetx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 )
   {
      ptubetx.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      ptubetx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptubetx.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      ptubetx.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = GXutil.space( (short)(70)) ;
      /* Using cursor P01FB2 */
      pr_default.execute(0, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1FB2 = false ;
         A1266BarAlbTub = P01FB2_A1266BarAlbTub[0] ;
         A3271AlbHdrAnc = P01FB2_A3271AlbHdrAnc[0] ;
         A1207TubNom = P01FB2_A1207TubNom[0] ;
         n1207TubNom = P01FB2_n1207TubNom[0] ;
         A1206TubCod = P01FB2_A1206TubCod[0] ;
         n1206TubCod = P01FB2_n1206TubCod[0] ;
         A129BarCod = P01FB2_A129BarCod[0] ;
         A132BarCodReo = P01FB2_A132BarCodReo[0] ;
         A130BarCodPar = P01FB2_A130BarCodPar[0] ;
         A1207TubNom = P01FB2_A1207TubNom[0] ;
         n1207TubNom = P01FB2_n1207TubNom[0] ;
         while ( (pr_default.getStatus(0) != 101) && ( P01FB2_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk1FB2 = false ;
            A1266BarAlbTub = P01FB2_A1266BarAlbTub[0] ;
            A3271AlbHdrAnc = P01FB2_A3271AlbHdrAnc[0] ;
            A1207TubNom = P01FB2_A1207TubNom[0] ;
            n1207TubNom = P01FB2_n1207TubNom[0] ;
            A1206TubCod = P01FB2_A1206TubCod[0] ;
            n1206TubCod = P01FB2_n1206TubCod[0] ;
            A129BarCod = P01FB2_A129BarCod[0] ;
            A132BarCodReo = P01FB2_A132BarCodReo[0] ;
            A130BarCodPar = P01FB2_A130BarCodPar[0] ;
            A1207TubNom = P01FB2_A1207TubNom[0] ;
            n1207TubNom = P01FB2_n1207TubNom[0] ;
            if ( GXutil.strcmp(P01FB2_A396EmprCod[0], A396EmprCod) == 0 )
            {
               AV10Sum_tubos = (short)(0) ;
               while ( (pr_default.getStatus(0) != 101) && ( P01FB2_A30AlbProCod[0] == A30AlbProCod ) && ( P01FB2_A1206TubCod[0] == A1206TubCod ) )
               {
                  brk1FB2 = false ;
                  A1266BarAlbTub = P01FB2_A1266BarAlbTub[0] ;
                  A3271AlbHdrAnc = P01FB2_A3271AlbHdrAnc[0] ;
                  A129BarCod = P01FB2_A129BarCod[0] ;
                  A132BarCodReo = P01FB2_A132BarCodReo[0] ;
                  A130BarCodPar = P01FB2_A130BarCodPar[0] ;
                  if ( GXutil.strcmp(P01FB2_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     AV10Sum_tubos = (short)(AV10Sum_tubos+A1266BarAlbTub) ;
                  }
                  brk1FB2 = true ;
                  pr_default.readNext(0);
               }
               if ( GXutil.strcmp(Gx_msg, GXutil.space( (short)(70))) == 0 )
               {
                  Gx_msg = GXutil.trim( GXutil.substring( A1207TubNom, 1, 7)) + " " + GXutil.trim( GXutil.str( AV10Sum_tubos, 4, 0)) ;
               }
               else
               {
                  AV11Msg_1 = GXutil.trim( GXutil.substring( A1207TubNom, 1, 7)) + " " + GXutil.trim( GXutil.str( AV10Sum_tubos, 4, 0)) ;
                  Gx_msg = GXutil.concat( Gx_msg, AV11Msg_1, " ") ;
               }
            }
            if ( ! brk1FB2 )
            {
               brk1FB2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk1FB2 )
         {
            brk1FB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptubetx.this.A396EmprCod;
      this.aP1[0] = ptubetx.this.A30AlbProCod;
      this.aP2[0] = ptubetx.this.Gx_msg;
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
      P01FB2_A396EmprCod = new String[] {""} ;
      P01FB2_A30AlbProCod = new long[1] ;
      P01FB2_A1266BarAlbTub = new int[1] ;
      P01FB2_A3271AlbHdrAnc = new short[1] ;
      P01FB2_A1207TubNom = new String[] {""} ;
      P01FB2_n1207TubNom = new boolean[] {false} ;
      P01FB2_A1206TubCod = new short[1] ;
      P01FB2_n1206TubCod = new boolean[] {false} ;
      P01FB2_A129BarCod = new int[1] ;
      P01FB2_A132BarCodReo = new byte[1] ;
      P01FB2_A130BarCodPar = new String[] {""} ;
      A1207TubNom = "" ;
      A130BarCodPar = "" ;
      AV11Msg_1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptubetx__default(),
         new Object[] {
             new Object[] {
            P01FB2_A396EmprCod, P01FB2_A30AlbProCod, P01FB2_A1266BarAlbTub, P01FB2_A3271AlbHdrAnc, P01FB2_A1207TubNom, P01FB2_n1207TubNom, P01FB2_A1206TubCod, P01FB2_n1206TubCod, P01FB2_A129BarCod, P01FB2_A132BarCodReo,
            P01FB2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A3271AlbHdrAnc ;
   private short A1206TubCod ;
   private short AV10Sum_tubos ;
   private short Gx_err ;
   private int A1266BarAlbTub ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1207TubNom ;
   private String A130BarCodPar ;
   private String AV11Msg_1 ;
   private boolean brk1FB2 ;
   private boolean n1207TubNom ;
   private boolean n1206TubCod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FB2_A396EmprCod ;
   private long[] P01FB2_A30AlbProCod ;
   private int[] P01FB2_A1266BarAlbTub ;
   private short[] P01FB2_A3271AlbHdrAnc ;
   private String[] P01FB2_A1207TubNom ;
   private boolean[] P01FB2_n1207TubNom ;
   private short[] P01FB2_A1206TubCod ;
   private boolean[] P01FB2_n1206TubCod ;
   private int[] P01FB2_A129BarCod ;
   private byte[] P01FB2_A132BarCodReo ;
   private String[] P01FB2_A130BarCodPar ;
}

final  class ptubetx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FB2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarAlbTub, T1.AlbHdrAnc, T2.TubNom, T1.TubCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPALBBAR T1 LEFT JOIN TXPTUBOS T2 ON T2.EmprCod = T1.EmprCod AND T2.TubCod = T1.TubCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE (T1.AlbProCod = ?) AND (T1.EmprCod = ?) ORDER BY T1.AlbProCod, T1.TubCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

