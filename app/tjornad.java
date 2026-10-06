package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tjornad", "/app.tjornad"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tjornad extends GXWebObjectStub
{
   public tjornad( )
   {
   }

   public tjornad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tjornad.class ));
   }

   public tjornad( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tjornad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tjornad_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Histórico de Jornadas /Operari";
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

