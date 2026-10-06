package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.veranyadidas", "/app.formulaciontinte.veranyadidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class veranyadidas extends GXWebObjectStub
{
   public veranyadidas( )
   {
   }

   public veranyadidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( veranyadidas.class ));
   }

   public veranyadidas( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new veranyadidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new veranyadidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pesaje Automatico";
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

