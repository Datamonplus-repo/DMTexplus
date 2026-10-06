package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcodparww", "/app.tcodparww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodparww extends GXWebObjectStub
{
   public tcodparww( )
   {
   }

   public tcodparww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodparww.class ));
   }

   public tcodparww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodparww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodparww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " CODIGOS DE PARO";
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

