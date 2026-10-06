package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsertdisqui extends GXProcedure
{
   public pinsertdisqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsertdisqui.class ), "" );
   }

   public pinsertdisqui( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pinsertdisqui.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pinsertdisqui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsertdisqui.this.AV42DisCod = aP1[0];
      this.aP1 = aP1;
      pinsertdisqui.this.AV50Pgmnamein = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV47station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV48Emprnom ;
      GXv_char3[0] = AV49Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV47station, GXv_char1, GXv_char2, GXv_char3) ;
      pinsertdisqui.this.A396EmprCod = GXv_char1[0] ;
      pinsertdisqui.this.AV48Emprnom = GXv_char2[0] ;
      pinsertdisqui.this.AV49Usurcod = GXv_char3[0] ;
      AV34Count = 0 ;
      AV41Fasquilin = (short)(1) ;
      /* Using cursor P05EM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV42DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P05EM2_A361DisCod[0] ;
         A457FasCod = P05EM2_A457FasCod[0] ;
         A460FasDsc = P05EM2_A460FasDsc[0] ;
         A4903FasAcab = P05EM2_A4903FasAcab[0] ;
         n4903FasAcab = P05EM2_n4903FasAcab[0] ;
         A368DisFasLin = P05EM2_A368DisFasLin[0] ;
         A758ProCod = P05EM2_A758ProCod[0] ;
         A460FasDsc = P05EM2_A460FasDsc[0] ;
         A4903FasAcab = P05EM2_A4903FasAcab[0] ;
         n4903FasAcab = P05EM2_n4903FasAcab[0] ;
         AV39Procod = A758ProCod ;
         AV43DisFasLin = A368DisFasLin ;
         AV44FasCod = A457FasCod ;
         AV46Inc_obs = httpContext.getMessage( "Lectura DISFAS.", "") + GXutil.newLine( ) ;
         AV46Inc_obs += httpContext.getMessage( "Discod ", "") + GXutil.str( A361DisCod, 8, 0) + GXutil.newLine( ) ;
         AV46Inc_obs += httpContext.getMessage( "Procod    ", "") + GXutil.trim( AV39Procod) + GXutil.newLine( ) ;
         AV46Inc_obs += httpContext.getMessage( "DisFasLin ", "") + GXutil.str( AV43DisFasLin, 4, 0) + GXutil.newLine( ) ;
         AV46Inc_obs += httpContext.getMessage( "Fascod    ", "") + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + GXutil.newLine( ) ;
         AV46Inc_obs += httpContext.getMessage( "FasAcab   ", "") + A4903FasAcab + GXutil.newLine( ) ;
         AV46Inc_obs += httpContext.getMessage( "Fasquilin ", "") + GXutil.str( AV41Fasquilin, 4, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV54Pgmname, AV49Usurcod, AV47station, AV46Inc_obs, A361DisCod, (byte)(0), " ") ;
         if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Execute user subroutine: 'FASPR1' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV46Inc_obs = httpContext.getMessage( "Creacion DISQUI.", "") + GXutil.newLine( ) ;
            AV46Inc_obs += httpContext.getMessage( "Proforcod ", "") + GXutil.trim( AV45PROFORCOD) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV54Pgmname, AV49Usurcod, AV47station, AV46Inc_obs, A361DisCod, (byte)(0), " ") ;
            /* Execute user subroutine: 'DISQUI' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV41Fasquilin = (short)(AV41Fasquilin+1) ;
            AV34Count = (int)(AV34Count+1) ;
            Gx_msg = httpContext.getMessage( "Procesando...= ", "") + GXutil.str( AV40barordlin, 4, 0) + " " + A457FasCod + " " + A460FasDsc ;
            System.out.println( Gx_msg );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISQUI' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPDISQUI

      */
      A361DisCod = AV42DisCod ;
      A758ProCod = AV39Procod ;
      A368DisFasLin = AV43DisFasLin ;
      A5377DisQuiLin = AV41Fasquilin ;
      A764ProForCod = AV45PROFORCOD ;
      A5378DisQuiNp = (short)(0) ;
      A5379DisQuiTp = (short)(0) ;
      A5380DisQuiRb = (short)(0) ;
      A5489DisQuiDsc = httpContext.getMessage( "Creado ", "") + GXutil.trim( AV50Pgmnamein) ;
      /* Using cursor P05EM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
      if ( (pr_default.getStatus(1) == 1) )
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
   }

   public void S121( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      AV45PROFORCOD = "XXXXXX" ;
      /* Using cursor P05EM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV44FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P05EM4_A457FasCod[0] ;
         A764ProForCod = P05EM4_A764ProForCod[0] ;
         A4650FasForLin = P05EM4_A4650FasForLin[0] ;
         AV45PROFORCOD = A764ProForCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsertdisqui.this.A396EmprCod;
      this.aP1[0] = pinsertdisqui.this.AV42DisCod;
      this.aP2[0] = pinsertdisqui.this.AV50Pgmnamein;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinsertdisqui");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47station = "" ;
      GXv_char1 = new String[1] ;
      AV48Emprnom = "" ;
      GXv_char2 = new String[1] ;
      AV49Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05EM2_A396EmprCod = new String[] {""} ;
      P05EM2_A361DisCod = new int[1] ;
      P05EM2_A457FasCod = new String[] {""} ;
      P05EM2_A460FasDsc = new String[] {""} ;
      P05EM2_A4903FasAcab = new String[] {""} ;
      P05EM2_n4903FasAcab = new boolean[] {false} ;
      P05EM2_A368DisFasLin = new short[1] ;
      P05EM2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4903FasAcab = "" ;
      A758ProCod = "" ;
      AV39Procod = "" ;
      AV44FasCod = "" ;
      AV46Inc_obs = "" ;
      AV54Pgmname = "" ;
      AV45PROFORCOD = "" ;
      Gx_msg = "" ;
      A764ProForCod = "" ;
      A5489DisQuiDsc = "" ;
      Gx_emsg = "" ;
      P05EM4_A396EmprCod = new String[] {""} ;
      P05EM4_A457FasCod = new String[] {""} ;
      P05EM4_A764ProForCod = new String[] {""} ;
      P05EM4_A4650FasForLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsertdisqui__default(),
         new Object[] {
             new Object[] {
            P05EM2_A396EmprCod, P05EM2_A361DisCod, P05EM2_A457FasCod, P05EM2_A460FasDsc, P05EM2_A4903FasAcab, P05EM2_n4903FasAcab, P05EM2_A368DisFasLin, P05EM2_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05EM4_A396EmprCod, P05EM4_A457FasCod, P05EM4_A764ProForCod, P05EM4_A4650FasForLin
            }
         }
      );
      AV54Pgmname = "PInsertDisqui" ;
      /* GeneXus formulas. */
      AV54Pgmname = "PInsertDisqui" ;
      Gx_err = (short)(0) ;
   }

   private short AV41Fasquilin ;
   private short A368DisFasLin ;
   private short AV43DisFasLin ;
   private short AV40barordlin ;
   private short A5377DisQuiLin ;
   private short A5378DisQuiNp ;
   private short A5379DisQuiTp ;
   private short A5380DisQuiRb ;
   private short Gx_err ;
   private short A4650FasForLin ;
   private int AV42DisCod ;
   private int AV34Count ;
   private int A361DisCod ;
   private int GX_INS780 ;
   private String A396EmprCod ;
   private String AV50Pgmnamein ;
   private String AV47station ;
   private String GXv_char1[] ;
   private String AV48Emprnom ;
   private String GXv_char2[] ;
   private String AV49Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A4903FasAcab ;
   private String A758ProCod ;
   private String AV39Procod ;
   private String AV44FasCod ;
   private String AV54Pgmname ;
   private String AV45PROFORCOD ;
   private String Gx_msg ;
   private String A764ProForCod ;
   private String A5489DisQuiDsc ;
   private String Gx_emsg ;
   private boolean n4903FasAcab ;
   private boolean returnInSub ;
   private String AV46Inc_obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05EM2_A396EmprCod ;
   private int[] P05EM2_A361DisCod ;
   private String[] P05EM2_A457FasCod ;
   private String[] P05EM2_A460FasDsc ;
   private String[] P05EM2_A4903FasAcab ;
   private boolean[] P05EM2_n4903FasAcab ;
   private short[] P05EM2_A368DisFasLin ;
   private String[] P05EM2_A758ProCod ;
   private String[] P05EM4_A396EmprCod ;
   private String[] P05EM4_A457FasCod ;
   private String[] P05EM4_A764ProForCod ;
   private short[] P05EM4_A4650FasForLin ;
}

final  class pinsertdisqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05EM2", "SELECT T1.EmprCod, T1.DisCod, T1.FasCod, T2.FasDsc, T2.FasAcab, T1.DisFasLin, T1.ProCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05EM3", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
         ,new ForEachCursor("P05EM4", "SELECT EmprCod, FasCod, ProForCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 20);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

