package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.duplicaciondefases_2", "/app.duplicaciondefases_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class duplicaciondefases_2 extends GXWebObjectStub
{
   public duplicaciondefases_2( )
   {
   }

   public duplicaciondefases_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( duplicaciondefases_2.class ));
   }

   public duplicaciondefases_2( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new duplicaciondefases_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new duplicaciondefases_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicacion de Fases";
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

