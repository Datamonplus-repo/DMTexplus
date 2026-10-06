package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pprvdocument", "/app.pprvdocument"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pprvdocument extends GXWebObjectStub
{
   public pprvdocument( )
   {
   }

   public pprvdocument( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pprvdocument.class ));
   }

   public pprvdocument( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pprvdocument_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pprvdocument_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guia de Trasporte";
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

