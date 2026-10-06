package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconvnuc extends GXProcedure
{
   public pconvnuc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconvnuc.class ), "" );
   }

   public pconvnuc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( java.math.BigDecimal[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           java.math.BigDecimal[] aP3 )
   {
      pconvnuc.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( java.math.BigDecimal[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( java.math.BigDecimal[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             byte[] aP4 )
   {
      pconvnuc.this.AV15VNUM2 = aP0[0];
      this.aP0 = aP0;
      pconvnuc.this.AV16VTEXT1 = aP1[0];
      this.aP1 = aP1;
      pconvnuc.this.AV17VTEXT2 = aP2[0];
      this.aP2 = aP2;
      pconvnuc.this.AV44factrm = aP3[0];
      this.aP3 = aP3;
      pconvnuc.this.AV18VLTXT = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV38EmprCod ;
      GXv_char2[0] = AV48Emprnom ;
      GXv_char3[0] = AV40UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char1, GXv_char2, GXv_char3) ;
      pconvnuc.this.AV38EmprCod = GXv_char1[0] ;
      pconvnuc.this.AV48Emprnom = GXv_char2[0] ;
      pconvnuc.this.AV40UsurCod = GXv_char3[0] ;
      /* Using cursor P02SC2 */
      pr_default.execute(0, new Object[] {AV38EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P02SC2_A396EmprCod[0] ;
         A3915EmpNumDec = P02SC2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P02SC2_n3915EmpNumDec[0] ;
         AV39EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV20VNUM = AV15VNUM2 ;
      AV29VTNUM = GXutil.str( AV20VNUM, 15, 2) ;
      AV41ValDec = (byte)(GXutil.lval( GXutil.substring( AV29VTNUM, 14, 2))) ;
      AV42ValDecD = (byte)(GXutil.lval( GXutil.substring( AV29VTNUM, 14, 1))) ;
      AV43ValDecUni = (byte)(GXutil.lval( GXutil.substring( AV29VTNUM, 15, 1))) ;
      AV22VUNI = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 10, 3))) ;
      AV23VMIL = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 7, 3))) ;
      AV24VUNIM = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 4, 3))) ;
      AV25VMILM = (short)(GXutil.lval( GXutil.substring( AV29VTNUM, 1, 3))) ;
      AV45LONTEXT1 = AV18VLTXT ;
      AV19VTEXT = "##" ;
      if ( ( AV25VMILM > 0 ) || ( AV25VMILM < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV25VMILM/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV25VMILM-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV25VMILM-AV26CENT*100-AV27DEC*10)) ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         if ( ( AV23VMIL > 1 ) || ( AV23VMIL < 0 ) )
         {
            GXv_char3[0] = AV19VTEXT ;
            GXv_int4[0] = AV26CENT ;
            GXv_int5[0] = AV27DEC ;
            GXv_int6[0] = AV28UNI ;
            GXv_char2[0] = AV36GENERO ;
            GXv_int7[0] = AV39EmpNumDec ;
            new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_int6, GXv_char2, GXv_int7) ;
            pconvnuc.this.AV19VTEXT = GXv_char3[0] ;
            pconvnuc.this.AV26CENT = GXv_int4[0] ;
            pconvnuc.this.AV27DEC = GXv_int5[0] ;
            pconvnuc.this.AV28UNI = GXv_int6[0] ;
            pconvnuc.this.AV36GENERO = GXv_char2[0] ;
            pconvnuc.this.AV39EmpNumDec = GXv_int7[0] ;
         }
         AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MIL", ""), " ") ;
         if ( AV24VUNIM == 0 )
         {
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MILLONES", ""), " ") ;
         }
      }
      if ( ( AV24VUNIM > 0 ) || ( AV24VUNIM < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV24VUNIM/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV24VUNIM-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV24VUNIM-AV26CENT*100-AV27DEC*10)) ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         if ( ( AV24VUNIM > 1 ) || ( AV24VUNIM < 0 ) )
         {
            GXv_char3[0] = AV19VTEXT ;
            GXv_int7[0] = AV26CENT ;
            GXv_int6[0] = AV27DEC ;
            GXv_int5[0] = AV28UNI ;
            GXv_char2[0] = AV36GENERO ;
            GXv_int4[0] = AV39EmpNumDec ;
            new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
            pconvnuc.this.AV19VTEXT = GXv_char3[0] ;
            pconvnuc.this.AV26CENT = GXv_int7[0] ;
            pconvnuc.this.AV27DEC = GXv_int6[0] ;
            pconvnuc.this.AV28UNI = GXv_int5[0] ;
            pconvnuc.this.AV36GENERO = GXv_char2[0] ;
            pconvnuc.this.AV39EmpNumDec = GXv_int4[0] ;
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MILLONES", ""), " ") ;
         }
         else
         {
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "UN MILLON", ""), " ") ;
         }
      }
      if ( ( AV23VMIL > 0 ) || ( AV23VMIL < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV23VMIL/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV23VMIL-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV23VMIL-AV26CENT*100-AV27DEC*10)) ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         if ( ( AV23VMIL > 1 ) || ( AV23VMIL < 0 ) )
         {
            GXv_char3[0] = AV19VTEXT ;
            GXv_int7[0] = AV26CENT ;
            GXv_int6[0] = AV27DEC ;
            GXv_int5[0] = AV28UNI ;
            GXv_char2[0] = AV36GENERO ;
            GXv_int4[0] = AV39EmpNumDec ;
            new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
            pconvnuc.this.AV19VTEXT = GXv_char3[0] ;
            pconvnuc.this.AV26CENT = GXv_int7[0] ;
            pconvnuc.this.AV27DEC = GXv_int6[0] ;
            pconvnuc.this.AV28UNI = GXv_int5[0] ;
            pconvnuc.this.AV36GENERO = GXv_char2[0] ;
            pconvnuc.this.AV39EmpNumDec = GXv_int4[0] ;
         }
         AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "MIL", ""), " ") ;
      }
      if ( ( AV22VUNI > 0 ) || ( AV22VUNI < 0 ) )
      {
         AV26CENT = (byte)(GXutil.Int( AV22VUNI/ (double) (100))) ;
         AV27DEC = (byte)(GXutil.Int( (AV22VUNI-AV26CENT*100)/ (double) (10))) ;
         AV28UNI = (byte)(GXutil.Int( AV22VUNI-AV26CENT*100-AV27DEC*10)) ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         GXv_char3[0] = AV19VTEXT ;
         GXv_int7[0] = AV26CENT ;
         GXv_int6[0] = AV27DEC ;
         GXv_int5[0] = AV28UNI ;
         GXv_char2[0] = AV36GENERO ;
         GXv_int4[0] = AV39EmpNumDec ;
         new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
         pconvnuc.this.AV19VTEXT = GXv_char3[0] ;
         pconvnuc.this.AV26CENT = GXv_int7[0] ;
         pconvnuc.this.AV27DEC = GXv_int6[0] ;
         pconvnuc.this.AV28UNI = GXv_int5[0] ;
         pconvnuc.this.AV36GENERO = GXv_char2[0] ;
         pconvnuc.this.AV39EmpNumDec = GXv_int4[0] ;
      }
      if ( ( AV41ValDec > 0 ) && ( AV39EmpNumDec == 2 ) )
      {
         if ( AV44factrm.doubleValue() == 0 )
         {
            AV19VTEXT += httpContext.getMessage( " PESOS M/L ", "") + httpContext.getMessage( " CON ", "") ;
         }
         else
         {
            AV19VTEXT += httpContext.getMessage( " USD ", "") + httpContext.getMessage( " CON ", "") ;
         }
         AV26CENT = (byte)(0) ;
         AV27DEC = AV42ValDecD ;
         AV28UNI = AV43ValDecUni ;
         AV36GENERO = httpContext.getMessage( "M", "") ;
         GXv_char3[0] = AV19VTEXT ;
         GXv_int7[0] = AV26CENT ;
         GXv_int6[0] = AV27DEC ;
         GXv_int5[0] = AV28UNI ;
         GXv_char2[0] = AV36GENERO ;
         GXv_int4[0] = AV39EmpNumDec ;
         new app.pcenttxt(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_int5, GXv_char2, GXv_int4) ;
         pconvnuc.this.AV19VTEXT = GXv_char3[0] ;
         pconvnuc.this.AV26CENT = GXv_int7[0] ;
         pconvnuc.this.AV27DEC = GXv_int6[0] ;
         pconvnuc.this.AV28UNI = GXv_int5[0] ;
         pconvnuc.this.AV36GENERO = GXv_char2[0] ;
         pconvnuc.this.AV39EmpNumDec = GXv_int4[0] ;
      }
      if ( ( AV23VMIL == 0 ) && ( AV22VUNI == 0 ) && ( ( AV24VUNIM > 0 ) || ( AV25VMILM > 0 ) ) )
      {
         if ( AV44factrm.doubleValue() == 0 )
         {
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "PESOS M/L ", ""), " ") ;
         }
         else
         {
            AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "USD ", ""), " ") ;
         }
      }
      else
      {
         if ( AV20VNUM.doubleValue() == 1 )
         {
            if ( AV39EmpNumDec == 0 )
            {
               AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "PESETA ", ""), " ") ;
            }
            else
            {
               if ( AV39EmpNumDec == 2 )
               {
                  if ( AV44factrm.doubleValue() == 0 )
                  {
                     AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "PESOS M/L ", ""), " ") ;
                  }
                  else
                  {
                     AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "USD ", ""), " ") ;
                  }
               }
            }
         }
         else
         {
            if ( AV39EmpNumDec == 0 )
            {
               AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "PESETAS ", ""), " ") ;
            }
            else
            {
               if ( AV39EmpNumDec == 2 )
               {
                  if ( AV44factrm.doubleValue() == 0 )
                  {
                     AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "PESOS M/L ", ""), " ") ;
                  }
                  else
                  {
                     AV19VTEXT = GXutil.concat( AV19VTEXT, httpContext.getMessage( "USD ", ""), " ") ;
                  }
               }
            }
         }
      }
      while ( GXutil.strcmp(GXutil.substring( AV19VTEXT, AV18VLTXT, 1), " ") != 0 )
      {
         AV18VLTXT = (byte)(AV18VLTXT-1) ;
      }
      if ( GXutil.strcmp(GXutil.substring( AV19VTEXT, AV18VLTXT, AV18VLTXT), "") != 0 )
      {
         AV16VTEXT1 = GXutil.substring( AV19VTEXT, 1, AV18VLTXT) ;
      }
      else
      {
         AV16VTEXT1 = GXutil.substring( AV19VTEXT, 1, AV18VLTXT) + "##" ;
      }
      AV18VLTXT = (byte)(AV18VLTXT+1) ;
      AV30VLTXT2 = (byte)(160-AV18VLTXT) ;
      if ( GXutil.strcmp(GXutil.substring( AV19VTEXT, AV18VLTXT, AV18VLTXT), "") != 0 )
      {
         AV17VTEXT2 = GXutil.substring( AV19VTEXT, AV18VLTXT, AV30VLTXT2) + "##" ;
      }
      else
      {
         AV17VTEXT2 = GXutil.substring( AV19VTEXT, AV18VLTXT, AV30VLTXT2) ;
      }
      AV18VLTXT = AV45LONTEXT1 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pconvnuc.this.AV15VNUM2;
      this.aP1[0] = pconvnuc.this.AV16VTEXT1;
      this.aP2[0] = pconvnuc.this.AV17VTEXT2;
      this.aP3[0] = pconvnuc.this.AV44factrm;
      this.aP4[0] = pconvnuc.this.AV18VLTXT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Station = "" ;
      AV38EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV48Emprnom = "" ;
      AV40UsurCod = "" ;
      scmdbuf = "" ;
      P02SC2_A396EmprCod = new String[] {""} ;
      P02SC2_A3915EmpNumDec = new byte[1] ;
      P02SC2_n3915EmpNumDec = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV20VNUM = DecimalUtil.ZERO ;
      AV29VTNUM = "" ;
      AV19VTEXT = "" ;
      AV36GENERO = "" ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pconvnuc__default(),
         new Object[] {
             new Object[] {
            P02SC2_A396EmprCod, P02SC2_A3915EmpNumDec, P02SC2_n3915EmpNumDec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18VLTXT ;
   private byte A3915EmpNumDec ;
   private byte AV39EmpNumDec ;
   private byte AV41ValDec ;
   private byte AV42ValDecD ;
   private byte AV43ValDecUni ;
   private byte AV45LONTEXT1 ;
   private byte AV26CENT ;
   private byte AV27DEC ;
   private byte AV28UNI ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte GXv_int5[] ;
   private byte GXv_int4[] ;
   private byte AV30VLTXT2 ;
   private short AV22VUNI ;
   private short AV23VMIL ;
   private short AV24VUNIM ;
   private short AV25VMILM ;
   private short Gx_err ;
   private java.math.BigDecimal AV15VNUM2 ;
   private java.math.BigDecimal AV44factrm ;
   private java.math.BigDecimal AV20VNUM ;
   private String AV16VTEXT1 ;
   private String AV17VTEXT2 ;
   private String AV37Station ;
   private String AV38EmprCod ;
   private String GXv_char1[] ;
   private String AV48Emprnom ;
   private String AV40UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV29VTNUM ;
   private String AV19VTEXT ;
   private String AV36GENERO ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean n3915EmpNumDec ;
   private byte[] aP4 ;
   private java.math.BigDecimal[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02SC2_A396EmprCod ;
   private byte[] P02SC2_A3915EmpNumDec ;
   private boolean[] P02SC2_n3915EmpNumDec ;
}

final  class pconvnuc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02SC2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
      }
   }

}

