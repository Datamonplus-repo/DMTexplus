package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdefectosresumengooglechart", "/app.wcdefectosresumengooglechart"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdefectosresumengooglechart extends GXWebObjectStub
{
   public wcdefectosresumengooglechart( )
   {
   }

   public wcdefectosresumengooglechart( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdefectosresumengooglechart.class ));
   }

   public wcdefectosresumengooglechart( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdefectosresumengooglechart_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdefectosresumengooglechart_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCDefectos Resumen Google Chart";
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

