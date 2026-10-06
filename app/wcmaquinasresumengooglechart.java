package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcmaquinasresumengooglechart", "/app.wcmaquinasresumengooglechart"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcmaquinasresumengooglechart extends GXWebObjectStub
{
   public wcmaquinasresumengooglechart( )
   {
   }

   public wcmaquinasresumengooglechart( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcmaquinasresumengooglechart.class ));
   }

   public wcmaquinasresumengooglechart( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcmaquinasresumengooglechart_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcmaquinasresumengooglechart_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCMaquinas Resumen Google Chart";
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

