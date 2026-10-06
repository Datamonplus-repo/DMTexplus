package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevcrulevel1devolucionalmacentejidocrudosindetallewc", "/app.tdevcrulevel1devolucionalmacentejidocrudosindetallewc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevcrulevel1devolucionalmacentejidocrudosindetallewc extends GXWebObjectStub
{
   public tdevcrulevel1devolucionalmacentejidocrudosindetallewc( )
   {
   }

   public tdevcrulevel1devolucionalmacentejidocrudosindetallewc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevcrulevel1devolucionalmacentejidocrudosindetallewc.class ));
   }

   public tdevcrulevel1devolucionalmacentejidocrudosindetallewc( int remoteHandle ,
                                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevcrulevel1devolucionalmacentejidocrudosindetallewc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevcrulevel1devolucionalmacentejidocrudosindetallewc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDEVCRULevel1 Devolucion Almacen Tejido Crudosindetalle WC";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

