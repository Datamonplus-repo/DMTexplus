package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aphrag15 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aphrag15 pgm = new aphrag15 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aphrag15( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aphrag15.class ), "" );
   }

   public aphrag15( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15EmprCod = "001" ;
      AV30VarAux = "01/01/0001" ;
      AV31VarAuxD = localUtil.ctod( AV30VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV33VarAux2 = localUtil.ctod( AV30VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      /* Using cursor P023S2 */
      pr_default.execute(0, new Object[] {AV15EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P023S2_A396EmprCod[0] ;
         A9615Lb_FecIn = P023S2_A9615Lb_FecIn[0] ;
         n9615Lb_FecIn = P023S2_n9615Lb_FecIn[0] ;
         A9617Lb_FecOut = P023S2_A9617Lb_FecOut[0] ;
         n9617Lb_FecOut = P023S2_n9617Lb_FecOut[0] ;
         A9623Lb_FecTin = P023S2_A9623Lb_FecTin[0] ;
         n9623Lb_FecTin = P023S2_n9623Lb_FecTin[0] ;
         A9703Lb_FecAcF = P023S2_A9703Lb_FecAcF[0] ;
         n9703Lb_FecAcF = P023S2_n9703Lb_FecAcF[0] ;
         A9702Lb_FecPAc = P023S2_A9702Lb_FecPAc[0] ;
         n9702Lb_FecPAc = P023S2_n9702Lb_FecPAc[0] ;
         A9611Lb_Hdr = P023S2_A9611Lb_Hdr[0] ;
         A9612Lb_Hdrr = P023S2_A9612Lb_Hdrr[0] ;
         A9613Lb_Hdrp = P023S2_A9613Lb_Hdrp[0] ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9615Lb_FecIn)) )
         {
            A9615Lb_FecIn = AV33VarAux2 ;
            n9615Lb_FecIn = false ;
            Gx_msg = httpContext.getMessage( "Lb_fecin=", "") + localUtil.dtoc( A9615Lb_FecIn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            System.out.println( Gx_msg );
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9617Lb_FecOut)) )
         {
            A9617Lb_FecOut = AV33VarAux2 ;
            n9617Lb_FecOut = false ;
            Gx_msg = httpContext.getMessage( "Lb_fecout=", "") + localUtil.dtoc( A9617Lb_FecOut, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            System.out.println( Gx_msg );
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9623Lb_FecTin)) )
         {
            A9623Lb_FecTin = AV33VarAux2 ;
            n9623Lb_FecTin = false ;
            Gx_msg = httpContext.getMessage( "Lb_fectin=", "") + localUtil.dtoc( A9623Lb_FecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            System.out.println( Gx_msg );
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9703Lb_FecAcF)) )
         {
            A9703Lb_FecAcF = AV33VarAux2 ;
            n9703Lb_FecAcF = false ;
            Gx_msg = httpContext.getMessage( "Lb_fecacf=", "") + localUtil.dtoc( A9703Lb_FecAcF, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            System.out.println( Gx_msg );
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9702Lb_FecPAc)) )
         {
            A9702Lb_FecPAc = AV33VarAux2 ;
            n9702Lb_FecPAc = false ;
            Gx_msg = httpContext.getMessage( "Lb_fecpac=", "") + localUtil.dtoc( A9702Lb_FecPAc, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P023S3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n9615Lb_FecIn), A9615Lb_FecIn, Boolean.valueOf(n9617Lb_FecOut), A9617Lb_FecOut, Boolean.valueOf(n9623Lb_FecTin), A9623Lb_FecTin, Boolean.valueOf(n9703Lb_FecAcF), A9703Lb_FecAcF, Boolean.valueOf(n9702Lb_FecPAc), A9702Lb_FecPAc, A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(phrag15.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aphrag15");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15EmprCod = "" ;
      AV30VarAux = "" ;
      AV31VarAuxD = GXutil.nullDate() ;
      AV33VarAux2 = GXutil.nullDate() ;
      scmdbuf = "" ;
      P023S2_A396EmprCod = new String[] {""} ;
      P023S2_A9615Lb_FecIn = new java.util.Date[] {GXutil.nullDate()} ;
      P023S2_n9615Lb_FecIn = new boolean[] {false} ;
      P023S2_A9617Lb_FecOut = new java.util.Date[] {GXutil.nullDate()} ;
      P023S2_n9617Lb_FecOut = new boolean[] {false} ;
      P023S2_A9623Lb_FecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P023S2_n9623Lb_FecTin = new boolean[] {false} ;
      P023S2_A9703Lb_FecAcF = new java.util.Date[] {GXutil.nullDate()} ;
      P023S2_n9703Lb_FecAcF = new boolean[] {false} ;
      P023S2_A9702Lb_FecPAc = new java.util.Date[] {GXutil.nullDate()} ;
      P023S2_n9702Lb_FecPAc = new boolean[] {false} ;
      P023S2_A9611Lb_Hdr = new int[1] ;
      P023S2_A9612Lb_Hdrr = new byte[1] ;
      P023S2_A9613Lb_Hdrp = new String[] {""} ;
      A396EmprCod = "" ;
      A9615Lb_FecIn = GXutil.nullDate() ;
      A9617Lb_FecOut = GXutil.nullDate() ;
      A9623Lb_FecTin = GXutil.nullDate() ;
      A9703Lb_FecAcF = GXutil.nullDate() ;
      A9702Lb_FecPAc = GXutil.nullDate() ;
      A9613Lb_Hdrp = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aphrag15__default(),
         new Object[] {
             new Object[] {
            P023S2_A396EmprCod, P023S2_A9615Lb_FecIn, P023S2_n9615Lb_FecIn, P023S2_A9617Lb_FecOut, P023S2_n9617Lb_FecOut, P023S2_A9623Lb_FecTin, P023S2_n9623Lb_FecTin, P023S2_A9703Lb_FecAcF, P023S2_n9703Lb_FecAcF, P023S2_A9702Lb_FecPAc,
            P023S2_n9702Lb_FecPAc, P023S2_A9611Lb_Hdr, P023S2_A9612Lb_Hdrr, P023S2_A9613Lb_Hdrp
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A9612Lb_Hdrr ;
   private short Gx_err ;
   private int A9611Lb_Hdr ;
   private String AV15EmprCod ;
   private String AV30VarAux ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9613Lb_Hdrp ;
   private String Gx_msg ;
   private java.util.Date AV31VarAuxD ;
   private java.util.Date AV33VarAux2 ;
   private java.util.Date A9615Lb_FecIn ;
   private java.util.Date A9617Lb_FecOut ;
   private java.util.Date A9623Lb_FecTin ;
   private java.util.Date A9703Lb_FecAcF ;
   private java.util.Date A9702Lb_FecPAc ;
   private boolean n9615Lb_FecIn ;
   private boolean n9617Lb_FecOut ;
   private boolean n9623Lb_FecTin ;
   private boolean n9703Lb_FecAcF ;
   private boolean n9702Lb_FecPAc ;
   private IDataStoreProvider pr_default ;
   private String[] P023S2_A396EmprCod ;
   private java.util.Date[] P023S2_A9615Lb_FecIn ;
   private boolean[] P023S2_n9615Lb_FecIn ;
   private java.util.Date[] P023S2_A9617Lb_FecOut ;
   private boolean[] P023S2_n9617Lb_FecOut ;
   private java.util.Date[] P023S2_A9623Lb_FecTin ;
   private boolean[] P023S2_n9623Lb_FecTin ;
   private java.util.Date[] P023S2_A9703Lb_FecAcF ;
   private boolean[] P023S2_n9703Lb_FecAcF ;
   private java.util.Date[] P023S2_A9702Lb_FecPAc ;
   private boolean[] P023S2_n9702Lb_FecPAc ;
   private int[] P023S2_A9611Lb_Hdr ;
   private byte[] P023S2_A9612Lb_Hdrr ;
   private String[] P023S2_A9613Lb_Hdrp ;
}

final  class aphrag15__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P023S2", "SELECT EmprCod, Lb_FecIn, Lb_FecOut, Lb_FecTin, Lb_FecAcF, Lb_FecPAc, Lb_Hdr, Lb_Hdrr, Lb_Hdrp FROM TXPHDRINO WHERE EmprCod = ? ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P023S3", "UPDATE TXPHDRINO SET Lb_FecIn=?, Lb_FecOut=?, Lb_FecTin=?, Lb_FecAcF=?, Lb_FecPAc=?  WHERE EmprCod = ? AND Lb_Hdr = ? AND Lb_Hdrr = ? AND Lb_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRINO")
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
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
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               return;
      }
   }

}

