package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trecpot", "/app.trecpot"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trecpot extends GXWebObjectStub
{
   public trecpot( )
   {
   }

   public trecpot( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trecpot.class ));
   }

   public trecpot( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trecpot_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trecpot_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECETAS ACABADO , OLLAS (POT)";
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

