package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.prctccporhdr", "/app.prctccporhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class prctccporhdr extends GXWebObjectStub
{
   public prctccporhdr( )
   {
   }

   public prctccporhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( prctccporhdr.class ));
   }

   public prctccporhdr( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prctccporhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prctccporhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Receita";
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

