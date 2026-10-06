package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.duplicacionpreciosporfase", "/app.facturacion.duplicacionpreciosporfase"})
@jakarta.servlet.annotation.MultipartConfig
public final  class duplicacionpreciosporfase extends GXWebObjectStub
{
   public duplicacionpreciosporfase( )
   {
   }

   public duplicacionpreciosporfase( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( duplicacionpreciosporfase.class ));
   }

   public duplicacionpreciosporfase( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new duplicacionpreciosporfase_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new duplicacionpreciosporfase_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicacion Precios p/fase";
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

