package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_preparoxml", "/app.trabajosexternos.trabajoexterno_preparoxml"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_preparoxml extends GXWebObjectStub
{
   public trabajoexterno_preparoxml( )
   {
   }

   public trabajoexterno_preparoxml( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_preparoxml.class ));
   }

   public trabajoexterno_preparoxml( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_preparoxml_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_preparoxml_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preparo XML AT Trabajo Externo";
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

