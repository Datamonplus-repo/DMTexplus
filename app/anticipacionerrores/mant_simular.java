package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mant_simular", "/app.anticipacionerrores.mant_simular"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mant_simular extends GXWebObjectStub
{
   public mant_simular( )
   {
   }

   public mant_simular( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mant_simular.class ));
   }

   public mant_simular( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mant_simular_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mant_simular_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAnt_Simular";
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

