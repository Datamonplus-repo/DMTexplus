package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcclientesresumengooglechart", "/app.wcclientesresumengooglechart"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcclientesresumengooglechart extends GXWebObjectStub
{
   public wcclientesresumengooglechart( )
   {
   }

   public wcclientesresumengooglechart( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcclientesresumengooglechart.class ));
   }

   public wcclientesresumengooglechart( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcclientesresumengooglechart_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcclientesresumengooglechart_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCClientes Resumen Google Chart";
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

