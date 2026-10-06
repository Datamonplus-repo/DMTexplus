package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttpat", "/app.ttpat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttpat extends GXWebObjectStub
{
   public ttpat( )
   {
   }

   public ttpat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttpat.class ));
   }

   public ttpat( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttpat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttpat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS ARTICULOS";
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

