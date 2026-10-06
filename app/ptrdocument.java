package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ptrdocument", "/app.ptrdocument"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ptrdocument extends GXWebObjectStub
{
   public ptrdocument( )
   {
   }

   public ptrdocument( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ptrdocument.class ));
   }

   public ptrdocument( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ptrdocument_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ptrdocument_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento de TRANSPORTE";
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

